package org.example.models.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ToStringModel2 {
    @ToString.Include
    private int id;
    @ToString.Exclude
    private String name;
}