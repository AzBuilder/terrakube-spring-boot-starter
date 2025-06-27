package io.terrakube.client.model.organization.module;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ModuleAttributes {
    private String name;
    private String description;
    private String provider;
    private String source;
    private int downloadQuantity;
    private String registryPath;
    private List<String> versions;
    private String tagPrefix;
    private String folder;
}
