package io.terrakube.client.model.organization.vcs.github_app_token;

import io.terrakube.client.model.organization.vcs.Relationships;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitHubAppToken {
    GitHubAppTokenAttributes attributes;
    Relationships relationships;
}
