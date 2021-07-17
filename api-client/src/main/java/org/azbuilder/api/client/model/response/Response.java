package org.azbuilder.api.client.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T1> {
    T1 data;
}
