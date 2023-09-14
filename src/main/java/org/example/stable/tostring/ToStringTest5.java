package org.example.stable.tostring;

import org.example.models.tostring.ToStringModel5;

public class ToStringTest5 {
    public static void main(String[] args) {
        ToStringModel5 model = new ToStringModel5();
        model.setId(5);
        model.setName("tester");

        System.out.println(model); // ToStringModel5(id=5)
    }
}