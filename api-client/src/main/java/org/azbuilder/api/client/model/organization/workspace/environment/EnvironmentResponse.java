package org.azbuilder.api.client.model.organization.workspace.environment;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EnvironmentResponse<T1> {
    T1 data;
}
