package com.cydeo.model;

import lombok.Data;

@Data //never put @Component in model class
public class Comment {  //model, a main object that travelling through the app

    private String author;
    private String text;

}
