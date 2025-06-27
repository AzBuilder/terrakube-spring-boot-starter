package io.terrakube.client.model.organization.workspace;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WorkspaceAttributes {
    private String branch;
    private String source;
    private String name;
    private String terraformVersion;
}
