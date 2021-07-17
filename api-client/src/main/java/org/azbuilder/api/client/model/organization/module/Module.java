package org.azbuilder.api.client.model.organization.module;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.HashMap;

@Getter
@Setter
public class Module extends Resource {
    ModuleAttributes attributes;
    Relationships relationships;
}
