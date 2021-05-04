package org.azbuilder.api.client.model.organization.module.definition.parameter;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParameterResponse {
    List<Parameter> data;
}
