package org.azbuilder.api.client.model.organization;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrganizationResponse<T1,T2> {
    T1 data;
    List<T2> included;
}
