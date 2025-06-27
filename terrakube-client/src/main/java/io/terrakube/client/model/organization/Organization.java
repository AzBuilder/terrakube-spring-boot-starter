package io.terrakube.client.model.organization;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Organization extends Resource {
    OrganizationAttributes attributes;
    Relationships relationships;
}
