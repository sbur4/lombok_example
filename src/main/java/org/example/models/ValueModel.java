package org.example.models;

import lombok.Value;

@Value
//@Value is the immutable variant of @Data; all fields are made private and final by default, and setters are not generated
public class ValueModel {
    int id;
    String name;
}