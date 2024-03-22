package org.terrakube.client.spring.autoconfigure;

import feign.Feign;
import feign.Logger;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.terrakube.client.TerrakubeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.terrakube.client.dex.DexCredentialAuthentication;

@AutoConfiguration
@EnableConfigurationProperties(RestClientProperties.class)
@ConditionalOnMissingBean(TerrakubeClient.class)
public class RestClientAutoConfiguration {

    @Autowired
    private RestClientProperties restClientProperties;

    @Bean
    public TerrakubeClient restClient(RestClientProperties restClientProperties) {
        TerrakubeClient restClient = null;
        if (restClientProperties.isEnableSecurity()) {

            DexCredentialAuthentication clientCredentialAuthentication = new DexCredentialAuthentication(
                    restClientProperties.getSecretKey(),
                    restClientProperties.getCredentialType()
            );

            okhttp3.OkHttpClient customHttpClient = new okhttp3.OkHttpClient.Builder()
                    .authenticator(clientCredentialAuthentication)
                    .addInterceptor(clientCredentialAuthentication)
                    .build();

            restClient = Feign.builder()
                    .encoder(new GsonEncoder())
                    .decoder(new GsonDecoder())
                    .client(new OkHttpClient(customHttpClient))
                    .target(TerrakubeClient.class, restClientProperties.getUrl());
        }else{
            restClient = Feign.builder()
                    .encoder(new GsonEncoder())
                    .decoder(new GsonDecoder())
                    .logger(new Slf4jLogger())
                    .client(new OkHttpClient())
                    .logLevel(Logger.Level.FULL)
                    .target(TerrakubeClient.class, restClientProperties.getUrl());
        }


        return restClient;
    }
}
