package org.example.stable;

import org.example.models.GetSettetModel;

public class GetterSetterTest {
    public static void main(String[] args) {
        GetSettetModel gsModel = new GetSettetModel();
        gsModel.setId(1);
        gsModel.setName("tester");

        System.out.println(gsModel.getId());
        System.out.println(gsModel.getName());
        System.out.println(gsModel); //org.example.models.GetSettetModel@15db9742
    }
}