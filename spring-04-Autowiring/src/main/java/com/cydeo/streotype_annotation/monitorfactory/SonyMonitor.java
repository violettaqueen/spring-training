package com.cydeo.streotype_annotation.monitorfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SonyMonitor extends Monitor{

    public SonyMonitor() {
        super("25 inch beast","Sony",25);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }

}
