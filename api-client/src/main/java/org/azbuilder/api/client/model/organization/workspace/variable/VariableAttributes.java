package org.azbuilder.api.client.model.organization.workspace.variable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VariableAttributes {
    private String key;
    private String value;
    private boolean sensitive;
    private boolean hcl;
    private String category;
    private String description;
}
