package org.azbuilder.api.client.model.organization.provider.version.file;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

@Getter
@Setter
public class File extends Resource {
    FileAttributes attributes;
    Relationships relationships;
}
