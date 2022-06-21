package org.terrakube.client.model.organization.module;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Module extends Resource {
    ModuleAttributes attributes;
    Relationships relationships;
}
