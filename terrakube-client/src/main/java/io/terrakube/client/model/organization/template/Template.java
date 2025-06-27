package io.terrakube.client.model.organization.template;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Template extends Resource {
    private TemplateAttributes attributes;
    private Relationships relationships;
}
