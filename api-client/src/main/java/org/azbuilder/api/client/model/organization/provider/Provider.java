package org.azbuilder.api.client.model.organization.provider;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

@Getter
@Setter
public class Provider extends Resource {
    ProviderAttributes attributes;
    Relationships relationships;
}
