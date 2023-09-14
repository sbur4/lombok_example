package org.example.stable;

import org.example.models.BuilderModel;

public class BuilderTest {
    public static void main(String[] args) {
        BuilderModel bm = BuilderModel.builder().id(1).name("abc").name("def").lister("s").lister("e").build();

        System.out.println(bm);
    }
}