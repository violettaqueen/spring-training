package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register") //localhost:8080/mentor/register
    public String register(Model model) {

        List<String> batchList = Arrays.asList("JD1", "JD2", "JD3");
        model.addAttribute("batchList", batchList);

        model.addAttribute("mentor", new Mentor()); //need to pass this object to a view, go to html file

        return "mentor/mentor-register";
    }
    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor, Model model){

        //model.addAttribute("mentor", new Mentor());

        //return "mentor/mentor-confirmation";
        //return "mentor/mentor-register";

        return "redirect:/mentor/register";
    }


}
