package org.terrakube.client.model.organization.job.step;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StepAttributes {
    private String stepNumber;
    private String output;
    private String status;
    private String name;
}
