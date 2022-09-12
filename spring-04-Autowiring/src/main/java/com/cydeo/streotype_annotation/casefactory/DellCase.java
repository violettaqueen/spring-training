package com.cydeo.streotype_annotation.casefactory;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class DellCase extends Case  {

    public DellCase() {
        super("2208","Dell","240");
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

}
