package io.terrakube.client.model.organization.vcs;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Vcs extends Resource {
    VcsAttributes attributes;
    Relationships relationships;
}
