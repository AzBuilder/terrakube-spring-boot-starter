package org.azbuilder.api.client.model.organization.module.definition;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DefinitionResponse {
    List<Definition> data;
}
