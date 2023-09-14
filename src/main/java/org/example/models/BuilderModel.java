package org.example.models;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Builder
@Data
public class BuilderModel {
    int id;
    String name;
    @Singular("lister")
    List<String> list;
}