package org.example.models.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(onlyExplicitlyIncluded = true)
public class ToStringModel5 {
    @ToString.Include
    private int id;
    private String name;
}