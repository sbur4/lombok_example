package org.example.stable.eqhc;

import org.example.models.eqhc.EhcModel1;

public class EhcTest1 {
    public static void main(String[] args) {
        EhcModel1 model = new EhcModel1();
        model.setId(1);
        model.setName("tester");

        System.out.println(model.hashCode()); // -877165933 / 60
    }
}