package org.example.models.superbuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class BuilderModel extends SuperBuilderModel {
    private int price;

    @Builder(builderMethodName = "ext")
    public BuilderModel(int id, String name, int price) {
        super(id, name);
        this.price = price;
    }
}