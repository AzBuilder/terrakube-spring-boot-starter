package org.terrakube.client.model.organization.provider.version;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Version extends Resource {
    VersionAttributes attributes;
    Relationships relationships;
}
