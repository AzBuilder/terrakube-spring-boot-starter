package io.terrakube.client.model.organization.provider;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relationships {
    OrganizationData organization;
    VersionData version;
}
