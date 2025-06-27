package io.terrakube.client.model.organization.provider.version;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Version extends Resource {
    VersionAttributes attributes;
    Relationships relationships;
}
