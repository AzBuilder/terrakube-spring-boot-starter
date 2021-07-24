package org.azbuilder.api.client.model.organization.provider.version.file;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileAttributes {
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
