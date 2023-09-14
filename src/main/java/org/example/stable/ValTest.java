package org.example.stable;

import lombok.val;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// val - Finally! Hassle-free final local variables.
public class ValTest {
    public static void main(String[] args) {
        val str = "string";
        System.out.println(str);

        val dbl = 1.2;
        System.out.println(dbl);

        val list = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        System.out.println(list);

//        str = "new";
//        System.out.println(str);
    }
}