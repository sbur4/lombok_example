package org.example.models.constructors;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

//@NoArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PUBLIC) // same as default
public class NacModel1 {
    private int id;
    private String name;
}