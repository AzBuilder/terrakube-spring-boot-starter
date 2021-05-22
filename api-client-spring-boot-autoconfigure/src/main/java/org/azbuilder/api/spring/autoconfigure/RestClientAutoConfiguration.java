package org.azbuilder.api.spring.autoconfigure;

import feign.Feign;
import feign.okhttp.OkHttpClient;
import org.azbuilder.api.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.slf4j.Slf4jLogger;
import feign.Logger;
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
        RestClient restClient = Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client( new OkHttpClient())
                //.logger(new Slf4jLogger())
                //.logLevel(Logger.Level.BASIC)

                .target(RestClient.class, restClientProperties.getUrl());
        return restClient;
    }
}
