package org.azbuilder.api.client.model.organization.workspace;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.HashMap;

@Getter
@Setter
public class Workspace extends Resource {
    HashMap<String, String> attributes;
    Relationships relationships;
}
