package org.terrakube.client.model.organization;

import lombok.Getter;
import lombok.Setter;
import org.terrakube.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class VcsData {
    List<Resource> data;
}
