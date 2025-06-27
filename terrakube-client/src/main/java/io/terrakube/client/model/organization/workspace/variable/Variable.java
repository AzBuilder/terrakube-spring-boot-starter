package io.terrakube.client.model.organization.workspace.variable;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Variable extends Resource {
    VariableAttributes attributes;
    Relationships relationships;
}
