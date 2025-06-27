package io.terrakube.client.model.organization.job;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relationships {
    OrganizationData organization;
    WorkspaceData workspace;
    StepData step;
}
