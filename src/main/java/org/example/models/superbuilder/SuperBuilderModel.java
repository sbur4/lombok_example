package org.example.models.superbuilder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SuperBuilderModel {
    private int id;
    private String name;
}