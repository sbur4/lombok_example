package org.example.experimental;

import org.example.models.FieldDefaultsModel;

public class FieldDefaultsTest {
    public static void main(String[] args) {
        FieldDefaultsModel fdm = new FieldDefaultsModel(1,"tester");
//        fdm.getId() only getters if private
        System.out.println(fdm);
    }
}