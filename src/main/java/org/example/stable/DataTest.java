package org.example.stable;

import org.example.models.DataModel;

public class DataTest {
    public static void main(String[] args) {
        DataModel dm = new DataModel();
        dm.setId(1);
        dm.setName("abc");

        System.out.println(dm);
    }
}