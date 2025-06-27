package io.terrakube.client.model.organization.module;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.organization.workspace.VcsData;

@Getter
@Setter
public class Relationships {
    OrganizationData organization;
    VcsData vcs;
    SshData ssh;
}
