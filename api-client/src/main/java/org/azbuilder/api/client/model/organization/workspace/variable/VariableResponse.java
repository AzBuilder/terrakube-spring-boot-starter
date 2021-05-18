package org.azbuilder.api.client.model.organization.workspace.variable;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VariableResponse<T1> {
    T1 data;
}
