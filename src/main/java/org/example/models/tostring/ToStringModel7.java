package org.example.models.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(onlyExplicitlyIncluded = true)
public class ToStringModel7 {
    @ToString.Include(name = "_id") //change field name
    private int id;
    @ToString.Include(rank = 1) // output first
    private String name;
}