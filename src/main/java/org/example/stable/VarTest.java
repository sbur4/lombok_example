package org.example.stable;

import lombok.var;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// var - Mutably! Hassle-free local variables.
public class VarTest {
    public static void main(String[] args) {
        var str = "string";
        System.out.println(str);

        var dbl = 1.2;
        System.out.println(dbl);

        var list = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        System.out.println(list);

        str = "new";
        System.out.println(str);
    }
}