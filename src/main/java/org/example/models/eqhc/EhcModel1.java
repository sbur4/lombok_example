package org.example.models.eqhc;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class EhcModel1 {
    private int id;
//    @EqualsAndHashCode.Exclude
    private String name;
}