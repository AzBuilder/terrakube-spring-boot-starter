package org.azbuilder.api.client.model.organization;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relationships {
    JobData job;
    ModuleData module;
    WorkspaceData workspace;
    ProviderData provider;
    VcsData vcs;
}
