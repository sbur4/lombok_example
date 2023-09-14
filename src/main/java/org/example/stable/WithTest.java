package org.example.stable;

import org.example.models.WithModel;

public class WithTest {
    public static void main(String[] args) {
        WithModel model = new WithModel(7, "seven");

        System.out.println(model);
        System.out.println(model.withId(8));
        System.out.println(model.withName("null"));
        System.out.println(model);
    }
}