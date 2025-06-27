package io.terrakube.client.spring.autoconfigure;

import io.terrakube.client.dex.DexCredentialType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
@PropertySource(value = "classpath:application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
@ConfigurationProperties(prefix = "io.terrakube.client")
public class RestClientProperties {
    private boolean enableSecurity;
    private String url;
    private String secretKey;
    private DexCredentialType credentialType;
}
