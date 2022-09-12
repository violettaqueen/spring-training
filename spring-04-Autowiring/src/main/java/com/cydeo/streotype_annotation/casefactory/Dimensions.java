package com.cydeo.streotype_annotation.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Dimensions {
    
    private int width;
    private int height;
    private int depth;
    
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}