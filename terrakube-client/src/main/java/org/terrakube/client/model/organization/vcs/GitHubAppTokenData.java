package org.terrakube.client.model.organization.vcs;

import java.util.List;

import org.terrakube.client.model.generic.Resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitHubAppTokenData {
    List<Resource> data;    
}
