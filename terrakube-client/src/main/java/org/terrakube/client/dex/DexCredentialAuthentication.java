package org.terrakube.client.dex;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Slf4j
public class DexCredentialAuthentication implements Authenticator, Interceptor {

    private static final String ISSUER = "TerrakubeInternal";
    private static final String SUBJECT = "TerrakubeInternal (TOKEN)";
    private static final String EMAIL = "no-reply@terrakube.org";
    private static final String NAME = "TerrakubeInternal Client";

    private String secretKey;
    private String accessToken = "";
    private DexCredentialType dexCredentialType;

    public DexCredentialAuthentication(String secretKey, DexCredentialType dexCredentialType) {
        this.secretKey = secretKey;
        this.dexCredentialType = dexCredentialType;
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
        log.error("Generate Dex Authentication Private Token");
        String newToken = "";

        if (this.dexCredentialType.equals(DexCredentialType.INTERNAL)) {
            SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64URL.decode(this.secretKey));

            newToken = Jwts.builder()
                    .setIssuer(DexCredentialAuthentication.ISSUER)
                    .setSubject(DexCredentialAuthentication.SUBJECT)
                    .setAudience(DexCredentialAuthentication.ISSUER)
                    .claim("email", DexCredentialAuthentication.EMAIL)
                    .claim("email_verified", true)
                    .claim("name", DexCredentialAuthentication.NAME)
                    .setIssuedAt(Date.from(Instant.now()))
                    .setExpiration(Date.from(Instant.now().plus(30, ChronoUnit.DAYS)))
                    .signWith(key)
                    .compact();

        } else {
            newToken = this.secretKey;
        }

        return newToken;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = newRequestWithAccessToken(chain.request(), this.accessToken);
        Response response = chain.proceed(request);

        if (response.code() == HttpURLConnection.HTTP_UNAUTHORIZED || response.code() == HttpURLConnection.HTTP_FORBIDDEN) {
            synchronized (this) {
                return chain.proceed(newRequestWithAccessToken(request, generateAccessToken()));
            }
        }

        return response;
    }
}
