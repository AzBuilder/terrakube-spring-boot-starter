package org.terrakube.client.model.organization.workspace;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Workspace extends Resource {
    WorkspaceAttributes attributes;
    Relationships relationships;
}
