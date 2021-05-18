package org.azbuilder.api.client.model.organization.workspace.secret;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SecretResponse<T1> {
    T1 data;
}
