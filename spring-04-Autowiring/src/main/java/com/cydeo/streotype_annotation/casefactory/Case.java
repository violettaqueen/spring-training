package com.cydeo.streotype_annotation.casefactory;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter

public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    @Autowired
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public abstract void pressPowerButton();

}
