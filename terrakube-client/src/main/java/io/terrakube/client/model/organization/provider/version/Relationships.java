package io.terrakube.client.model.organization.provider.version;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relationships {
    ImplementationData implementation;
    ProviderData provider;
}
