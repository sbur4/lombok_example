package org.example.stable.tostring;

import org.example.models.tostring.ToStringModel6;

public class ToStringTest6 {
    public static void main(String[] args) {
        ToStringModel6 model = new ToStringModel6();
        model.setId(6);
        model.setName("tester");

        System.out.println(model); // ToStringModel6(id=6, name=tester)
    }
}