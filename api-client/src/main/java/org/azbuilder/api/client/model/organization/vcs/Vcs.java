package org.azbuilder.api.client.model.organization.vcs;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

@Getter
@Setter
public class Vcs extends Resource {
    VcsAttributes attributes;
    Relationships relationships;
}
