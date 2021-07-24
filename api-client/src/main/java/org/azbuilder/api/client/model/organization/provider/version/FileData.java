package org.azbuilder.api.client.model.organization.provider.version;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class FileData {
    List<Resource> data;
}
