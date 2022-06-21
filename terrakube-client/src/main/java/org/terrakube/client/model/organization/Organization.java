package org.terrakube.client.model.organization;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Organization extends Resource {
    OrganizationAttributes attributes;
    Relationships relationships;
}
