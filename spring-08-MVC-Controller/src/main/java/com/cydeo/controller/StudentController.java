package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    //method that defines end - point:
    @RequestMapping("/student")
    public String getStudentInfo(){
        return "student/welcome.html";
    }
}
