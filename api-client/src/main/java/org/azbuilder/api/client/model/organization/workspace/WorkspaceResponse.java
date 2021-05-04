package org.azbuilder.api.client.model.organization.workspace;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WorkspaceResponse {
    List<Workspace> data;
}
