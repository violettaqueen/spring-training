package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;

@SpringBootApplication(exclude = {AopAutoConfiguration.class}) // exclude to create objects
public class CydeoApp {

    public static void main(String[] args) {
        SpringApplication.run(CydeoApp.class, args);
    }

}
