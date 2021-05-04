package org.azbuilder.api.client.model.organization.module.definition;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.HashMap;

@Getter
@Setter
public class Definition extends Resource {
    HashMap<String, String> attributes;
    Relationships relationships;
}
