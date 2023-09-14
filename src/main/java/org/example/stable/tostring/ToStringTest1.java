package org.example.stable.tostring;

import org.example.models.tostring.ToStringModel1;

public class ToStringTest1 {
    public static void main(String[] args) {
        ToStringModel1 model = new ToStringModel1();
        model.setId(1);
        model.setName("tester");

        System.out.println(model); // ToStringModel1(id=1, name=tester)
    }
}