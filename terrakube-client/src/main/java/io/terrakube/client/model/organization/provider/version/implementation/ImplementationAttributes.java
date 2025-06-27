package io.terrakube.client.model.organization.provider.version.implementation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImplementationAttributes {
    private String os;
    private String arch;
    private String filename;
    private String downloadUrl;
    private String shasumsUrl;
    private String shasumsSignatureUrl;
    private String shasum;
    private String keyId;
    private String asciiArmor;
    private String trustSignature;
    private String source;
    private String sourceUrl;
}
