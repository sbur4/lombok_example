package org.example.stable.tostring;

import org.example.models.tostring.ToStringModel3;

public class ToStringTest3 {
    public static void main(String[] args) {
        ToStringModel3 model = new ToStringModel3();
        model.setId(3);
        model.setName("tester");

        System.out.println(model); // ToStringModel3(name=tester)
    }
}