package org.azbuilder.api.client.security.azure;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.Map;

public interface ClientCredentialApi {

    @RequestLine("GET /{tenantId}/oauth2/v2.0/token")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    Map<String, String> getAccessToken(@Param("tenantId") String tenantId, @Param("grant_type") String grantType, @Param("client_id") String clientId, @Param("scope") String scope, @Param("client_secret") String clientSecret);
}
