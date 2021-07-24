package org.azbuilder.api.client.model.organization.provider.version;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

@Getter
@Setter
public class Version extends Resource {
    VersionAttributes attributes;
    Relationships relationships;
}
