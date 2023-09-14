package org.example.stable.tostring;

import org.example.models.tostring.CallSuperToStringModel;

public class ToStringTest8 {
    public static void main(String[] args) {
        CallSuperToStringModel model = new CallSuperToStringModel();
        model.setId(8);
        model.setName("tester");
        model.setPrice(80);

        System.out.println(model); // CallSuperToString(super=ToStringModel1(id=8, name=tester), price=80)
    }
}