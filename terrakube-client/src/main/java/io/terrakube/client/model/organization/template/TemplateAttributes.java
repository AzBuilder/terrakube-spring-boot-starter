package io.terrakube.client.model.organization.template;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TemplateAttributes {
    private String name;
    private String description;
    private String version;
    private String tcl;
}
