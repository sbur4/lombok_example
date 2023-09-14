package org.example.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Setter
@Getter
@ToString
@Accessors(chain = true, fluent = true, makeFinal = true)
public class AccessorsModel {
    private int id;
    private String name;
}