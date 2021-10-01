package org.azbuilder.api.client.model.organization.module;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.organization.workspace.VcsData;

@Getter
@Setter
public class Relationships {
    OrganizationData organization;
    VcsData vcs;
}
