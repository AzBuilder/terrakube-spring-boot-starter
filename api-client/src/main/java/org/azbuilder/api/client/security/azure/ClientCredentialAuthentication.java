package org.azbuilder.api.client.security.azure;

import feign.Feign;
import feign.form.FormEncoder;
import feign.gson.GsonDecoder;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

@Slf4j
public class ClientCredentialAuthentication implements Authenticator, Interceptor {

    private static final String AZURE_ENDPOINT = "https://login.microsoftonline.com";
    private static final String GRANT_TYPE = "client_credentials";

    private String tenantId;
    private String clientId;
    private String clientSecret;
    private String scope;
    private ClientCredentialApi clientCredentialApi;
    private String accessToken = "";

    public ClientCredentialAuthentication(String tenantId, String clientId, String clientSecret, String scope) {
        this.tenantId = tenantId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.clientCredentialApi = Feign.builder()
                .encoder(new FormEncoder())
                .decoder(new GsonDecoder())
                .target(ClientCredentialApi.class, AZURE_ENDPOINT);
    }

    @Override
    public Request authenticate(Route route, Response response) {
        log.info("Authentication error {}", response.code());
        synchronized (this) {
            this.accessToken = generateAccessToken();
        }
        return newRequestWithAccessToken(response.request(), this.accessToken);
    }

    @NonNull
    private Request newRequestWithAccessToken(@NonNull Request request, String accessToken) {
        return request.newBuilder()
                .header("Authorization", "Bearer " + accessToken)
                .build();
    }

    private String generateAccessToken() {
        log.error("Renew Azure Active Directory Token");
        String accessToken = "";
        Map<String, String> response = clientCredentialApi.getAccessToken(
                this.tenantId,
                GRANT_TYPE,
                this.clientId,
                this.scope,
                this.clientSecret);

        if (response.containsKey("error")) {
            throw new RuntimeException(response.get("error_description"));
        }
        accessToken = response.get("access_token");
        log.info("Successful acquire new Azure AD access token");
        return accessToken;
    }


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = newRequestWithAccessToken(chain.request(), this.accessToken);
        Response response = chain.proceed(request);

        if (response.code() == HttpURLConnection.HTTP_UNAUTHORIZED) {
            synchronized (this) {
                return chain.proceed(newRequestWithAccessToken(request, generateAccessToken()));
            }
        }

        return response;
    }
}
