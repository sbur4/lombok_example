package org.example.models;

import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

import java.time.DayOfWeek;

@ToString
public class TolerateModel {
    @Setter
    private DayOfWeek day;

    @Tolerate
    public void setDay(int number) {
        this.day = DayOfWeek.of(number);
    }
}