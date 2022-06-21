package org.terrakube.client.model.organization.workspace;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relationships {
    JobData job;
    OrganizationData organization;
    VariableData variable;
    VcsData vcs;
    HistoryData history;
}
