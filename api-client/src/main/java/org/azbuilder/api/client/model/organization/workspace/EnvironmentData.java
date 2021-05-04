package org.azbuilder.api.client.model.organization.workspace;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class EnvironmentData {

    List<Resource> data;
}
