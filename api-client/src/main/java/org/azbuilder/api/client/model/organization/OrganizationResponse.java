package org.azbuilder.api.client.model.organization;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrganizationResponse<T> {

    List<Organization> data;
    List<T> included;
}
