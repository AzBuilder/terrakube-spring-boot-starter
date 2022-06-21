package org.terrakube.client.model.organization.provider;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Provider extends Resource {
    ProviderAttributes attributes;
    Relationships relationships;
}
