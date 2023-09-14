package org.example.models;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

@FieldNameConstants
@AllArgsConstructor
@ToString
public class FieldNameConstantsModel {
    private String str;
    private int anInt;
    @FieldNameConstants.Exclude
    private int anotherInt;
}