package org.example.models.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class CallSuperToStringModel extends ToStringModel1 {
    private int price;
}