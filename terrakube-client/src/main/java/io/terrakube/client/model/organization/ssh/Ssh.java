package io.terrakube.client.model.organization.ssh;

import lombok.Getter;
import lombok.Setter;
import io.terrakube.client.model.generic.Resource;

@Getter
@Setter
public class Ssh extends Resource {
    SshAttributes attributes;
    Relationships relationships;
}
