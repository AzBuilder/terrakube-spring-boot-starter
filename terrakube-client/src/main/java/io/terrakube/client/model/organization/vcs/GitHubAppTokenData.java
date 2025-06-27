package io.terrakube.client.model.organization.vcs;

import java.util.List;

import io.terrakube.client.model.generic.Resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitHubAppTokenData {
    List<Resource> data;    
}
