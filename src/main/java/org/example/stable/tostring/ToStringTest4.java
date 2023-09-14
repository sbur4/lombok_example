package org.example.stable.tostring;

import org.example.models.tostring.ToStringModel4;

public class ToStringTest4 {
    public static void main(String[] args) {
        ToStringModel4 model = new ToStringModel4();
        model.setId(4);
        model.setName("tester");

        System.out.println(model); // ToStringModel4(4, tester)
    }
}