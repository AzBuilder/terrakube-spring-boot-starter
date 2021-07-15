package org.azbuilder.api.client.model.organization.module;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ModuleResponse<T1,T2> {
    T1 data;
    List<T2> included;
}
