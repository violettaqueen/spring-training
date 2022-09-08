package com.cydeo.streotype_annotation.casefactory;

import lombok.Getter;

@Getter
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public abstract void pressPowerButton();

}
