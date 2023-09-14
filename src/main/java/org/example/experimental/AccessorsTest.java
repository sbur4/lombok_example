package org.example.experimental;

import org.example.models.AccessorsModel;

public class AccessorsTest {
    public static void main(String[] args) {
        generateAccessorsModel();

    }

    private static void generateAccessorsModel() {
        AccessorsModel model_1 = new AccessorsModel();
        model_1.id(1).name("tester"); // Method chaining
        System.out.println(model_1);

        int id = model_1.id(); // Fluent getter
        System.out.println(id);
        String name = model_1.name(); // Fluent getter
        System.out.println(name);

        model_1.id(3);
        System.out.println(model_1);
    }

}