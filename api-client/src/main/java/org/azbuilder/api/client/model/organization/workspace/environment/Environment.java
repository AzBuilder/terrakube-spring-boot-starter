package org.azbuilder.api.client.model.organization.workspace.environment;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.HashMap;

@Getter
@Setter
public class Environment extends Resource {
    HashMap<String, String> attributes;
    Relationships relationships;
}
