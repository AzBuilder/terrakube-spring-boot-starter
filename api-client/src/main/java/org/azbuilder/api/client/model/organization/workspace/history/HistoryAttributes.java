package org.azbuilder.api.client.model.organization.workspace.history;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoryAttributes {
    private String createdBy;
    private String createdDate;
    private String output;
    private String jobReference;
    private String updatedBy;
    private String updatedDate;
}
