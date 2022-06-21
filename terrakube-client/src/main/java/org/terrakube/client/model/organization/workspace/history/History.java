package org.terrakube.client.model.organization.workspace.history;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class History extends Resource {
    HistoryAttributes attributes;
    Relationships relationships;
}
