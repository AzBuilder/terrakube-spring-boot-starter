package org.azbuilder.api.client.model.organization.job.step;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

@Getter
@Setter
public class Step extends Resource {
    StepAttributes attributes;
    Relationships relationships;
}
