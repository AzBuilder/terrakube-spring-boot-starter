package io.terrakube.client.model.organization;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class ModuleData {
    List<Resource> data;
}
