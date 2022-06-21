package org.terrakube.client.model.organization.template;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Template extends Resource {
    private TemplateAttributes attributes;
    private Relationships relationships;
}
