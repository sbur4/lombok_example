package org.example.stable.tostring;

import org.example.models.tostring.ToStringModel2;

public class ToStringTest2 {
    public static void main(String[] args) {
        ToStringModel2 model = new ToStringModel2();
        model.setId(2);
        model.setName("tester");

        System.out.println(model); // ToStringModel2(id=2)
    }
}