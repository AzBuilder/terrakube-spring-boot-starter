package org.terrakube.client.model.organization.ssh;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SshAttributes {
    private String createdBy;
    private String createdDate;
    private String description;
    private String name;
    private String sshType;
    private String privateKey;
    private String updatedBy;
    private String updatedDate;
}
