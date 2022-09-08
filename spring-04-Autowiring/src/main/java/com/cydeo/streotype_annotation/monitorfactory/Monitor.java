package com.cydeo.streotype_annotation.monitorfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Monitor {

    private String model;
    private String manufacturer;
    private int size;

    public Monitor(String model, String manufacturer, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public abstract void drawPixelAt();

}
