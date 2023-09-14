package org.example.models.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString(doNotUseGetters = true)
public class ToStringModel6 {
    @Setter
    @Getter
    private int id;
    @Setter
    private String name;

    public String getName() {
        return "hello" + name;
    }
}