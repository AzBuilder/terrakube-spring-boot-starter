package org.azbuilder.api.spring.autoconfigure;

import feign.Feign;
import feign.Logger;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.azbuilder.api.client.RestClient;
import org.azbuilder.api.client.security.azure.ClientCredentialAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

@Configuration
@EnableConfigurationProperties(RestClientProperties.class)
@ConditionalOnMissingBean(RestClient.class)
public class RestClientAutoConfiguration {

    @Autowired
    private RestClientProperties restClientProperties;

    @Bean
    public RestClient restClient(RestClientProperties restClientProperties) {

        ClientCredentialAuthentication clientCredentialAuthentication = new ClientCredentialAuthentication(
                restClientProperties.getTenantId(),
                restClientProperties.getClientId(),
                restClientProperties.getClientSecret(),
                restClientProperties.getScope()
        );

        okhttp3.OkHttpClient customHttpClient = new okhttp3.OkHttpClient.Builder()
                .authenticator(clientCredentialAuthentication)
                .addInterceptor(clientCredentialAuthentication)
                .build();

        RestClient restClient = Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client(new OkHttpClient(customHttpClient))
                //.logger(new Slf4jLogger())
                //.logLevel(Logger.Level.FULL)
                .target(RestClient.class, restClientProperties.getUrl());
        return restClient;
    }
}
