package io.terrakube.client.model.organization.provider.version;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class ImplementationData {
    List<Resource> data;
}
