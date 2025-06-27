package io.terrakube.client.model.organization.workspace.history;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class History extends Resource {
    HistoryAttributes attributes;
    Relationships relationships;
}
