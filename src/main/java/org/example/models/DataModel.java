package org.example.models;

import lombok.Data;

@Data
// @Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter
public class DataModel {
    int id;
    String name;
}