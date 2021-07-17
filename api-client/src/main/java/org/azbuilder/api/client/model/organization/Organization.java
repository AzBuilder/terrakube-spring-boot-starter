package org.azbuilder.api.client.model.organization;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.HashMap;

@Getter
@Setter
public class Organization extends Resource{
    OrganizationAttributes attributes;
    Relationships relationships;
}
