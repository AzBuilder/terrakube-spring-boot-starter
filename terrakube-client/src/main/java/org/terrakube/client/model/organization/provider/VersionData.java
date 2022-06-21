package org.terrakube.client.model.organization.provider;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class VersionData {
    List<Resource> data;
}
