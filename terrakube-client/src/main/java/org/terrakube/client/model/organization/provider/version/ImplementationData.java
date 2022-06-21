package org.terrakube.client.model.organization.provider.version;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class ImplementationData {
    List<Resource> data;
}
