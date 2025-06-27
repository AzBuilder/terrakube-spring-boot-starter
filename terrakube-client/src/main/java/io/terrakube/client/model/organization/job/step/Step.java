package io.terrakube.client.model.organization.job.step;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Step extends Resource {
    StepAttributes attributes;
    Relationships relationships;
}
