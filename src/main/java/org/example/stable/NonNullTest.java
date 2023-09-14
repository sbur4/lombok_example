package org.example.stable;

import lombok.NonNull;
import lombok.var;

public class NonNullTest {
    public static void main(String[] args) {
        var str = new String[]{"string", null};

        printer(str[0]);
        printer(str[1]);
    }

    private static void printer(@NonNull String s) {
        System.out.println(s);
    }
}