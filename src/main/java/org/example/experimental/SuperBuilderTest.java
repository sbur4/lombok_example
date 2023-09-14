package org.example.experimental;

import org.example.models.superbuilder.BuilderModel;
import org.example.models.superbuilder.SuperBuilderModel;

public class SuperBuilderTest {
    public static void main(String[] args) {
        SuperBuilderModel superBuilderModel = SuperBuilderModel.builder().id(1).name("abc").build();
        System.out.println(superBuilderModel);

        BuilderModel builderModel = BuilderModel.ext().price(1).build();
        System.out.println(builderModel);

        BuilderModel builderModel2 = BuilderModel.ext().id(2).name("def").price(3).build();
        System.out.println(builderModel2);
    }
}