package io.terrakube.client.model.organization.module;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModuleAttributes {
    private String name;
    private String description;
    private String provider;
    private String source;
    private int downloadQuantity;
    private String registryPath;
    private String tagPrefix;
    private String folder;
}
