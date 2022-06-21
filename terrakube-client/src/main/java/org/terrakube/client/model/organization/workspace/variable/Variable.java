package org.terrakube.client.model.organization.workspace.variable;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Variable extends Resource {
    VariableAttributes attributes;
    Relationships relationships;
}
