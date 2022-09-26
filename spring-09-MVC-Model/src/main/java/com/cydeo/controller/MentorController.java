package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import static com.cydeo.enums.Gender.FEMALE;
import static com.cydeo.enums.Gender.MALE;

@Controller
public class MentorController {
    @RequestMapping("/list") //pass it in localhost:8080/list
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", 23, MALE));
        mentorList.add(new Mentor("Tom", "Hanks", 43, MALE));
        mentorList.add(new Mentor("Ammy", "Brian", 33, FEMALE));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";  //mentor folder/ mentor-list
    }
}
