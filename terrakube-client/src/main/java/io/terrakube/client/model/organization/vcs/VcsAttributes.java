package io.terrakube.client.model.organization.vcs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VcsAttributes {
    private String name;
    private String description;
    private String clientId;
    private String clientSecret;
    private String accessToken;
    private String vcsType;
    private String connectionType;
}
