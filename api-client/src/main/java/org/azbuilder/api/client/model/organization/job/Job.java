package org.azbuilder.api.client.model.organization.job;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.HashMap;

@Getter
@Setter
public class Job extends Resource {
    JobAttributes attributes;
    Relationships relationships;
}
