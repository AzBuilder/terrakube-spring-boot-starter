package io.terrakube.client.model.organization.vcs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relationships {
    OrganizationData organization;
    GitHubAppTokenData github_app_token;    
}
