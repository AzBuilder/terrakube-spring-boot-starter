package io.terrakube.client.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseWithInclude<T1,T2> {
    T1 data;
    List<T2> included;
}
