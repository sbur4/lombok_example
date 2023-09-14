package org.example.experimental;

import org.example.models.TolerateModel;

import java.time.DayOfWeek;

public class TolerateTest {
    public static void main(String[] args) {
        TolerateModel tm = new TolerateModel();
        tm.setDay(7);
        System.out.println(tm);


        TolerateModel tm2 = new TolerateModel();
        tm2.setDay(DayOfWeek.FRIDAY);
        System.out.println(tm2);
    }
}