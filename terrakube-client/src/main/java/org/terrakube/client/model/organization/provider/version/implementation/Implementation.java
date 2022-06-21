package org.terrakube.client.model.organization.provider.version.implementation;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Implementation extends Resource {
    ImplementationAttributes attributes;
    Relationships relationships;
}
