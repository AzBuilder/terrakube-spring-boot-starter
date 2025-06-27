package io.terrakube.client.model.organization.provider;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Provider extends Resource {
    ProviderAttributes attributes;
    Relationships relationships;
}
