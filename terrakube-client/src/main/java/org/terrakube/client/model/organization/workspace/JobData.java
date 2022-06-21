package org.terrakube.client.model.organization.workspace;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class JobData {

    List<Resource> data;
}
