package org.azbuilder.api.client.model.organization.workspace.variable;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.HashMap;

@Getter
@Setter
public class Variable extends Resource {
    VariableAttributes attributes;
    Relationships relationships;
}
