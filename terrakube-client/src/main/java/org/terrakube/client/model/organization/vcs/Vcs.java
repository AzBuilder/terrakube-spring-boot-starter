package org.terrakube.client.model.organization.vcs;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Vcs extends Resource {
    VcsAttributes attributes;
    Relationships relationships;
}
