package io.terrakube.client.model.organization.module;

import java.util.List;

import io.terrakube.client.model.generic.Resource;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VersionData {
    List<Resource> data;
}
