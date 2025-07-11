package io.terrakube.client.model.organization.module;

import io.terrakube.client.model.organization.workspace.VcsData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relationships {
    OrganizationData organization;
    VcsData vcs;
    SshData ssh;
    VersionData version;
}
