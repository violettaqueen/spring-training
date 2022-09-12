package com.cydeo.casefactory;

public class DellCase extends Case {


    public DellCase(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        super(model, manufacturer, powerSupply, dimensions);
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }

}
