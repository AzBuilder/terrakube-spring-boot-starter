package io.terrakube.client.model.organization.provider.version.implementation;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Implementation extends Resource {
    ImplementationAttributes attributes;
    Relationships relationships;
}
