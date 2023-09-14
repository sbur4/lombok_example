package org.example.models.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(of = "name")
public class ToStringModel3 {
    private int id;
    private String name;
}