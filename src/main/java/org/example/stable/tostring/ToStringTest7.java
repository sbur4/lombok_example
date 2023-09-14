package org.example.stable.tostring;

import org.example.models.tostring.ToStringModel7;

public class ToStringTest7 {
    public static void main(String[] args) {
        ToStringModel7 model = new ToStringModel7();
        model.setId(7);
        model.setName("tester");

        System.out.println(model); // ToStringModel7(name=tester, _id=7)
    }
}