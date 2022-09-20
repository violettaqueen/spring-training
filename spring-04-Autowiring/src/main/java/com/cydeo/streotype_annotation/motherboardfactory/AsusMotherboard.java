package com.cydeo.streotype_annotation.motherboardfactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public class AsusMotherboard extends Motherboard {

    public AsusMotherboard() {
        super("BJ-200","Asus",4,6,"v2.44");
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

}