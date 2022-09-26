package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    //creating end-point:
    //@RequestMapping(value = "/register", method = RequestMethod.GET) //localhost:8080/student/register
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }
    @RequestMapping("/welcome") //localhost:8080/student/welcome?id=3
    @PostMapping("/welcome")
    public String welcome( @RequestParam String name){
        System.out.println(name);
        return "student/welcome";
    }
}
