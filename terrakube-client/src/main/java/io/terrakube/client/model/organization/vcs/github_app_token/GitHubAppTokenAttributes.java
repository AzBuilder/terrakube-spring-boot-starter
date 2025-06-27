package io.terrakube.client.model.organization.vcs.github_app_token;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitHubAppTokenAttributes {
   private String installationId;
   private String owner;
   private String token;
}
