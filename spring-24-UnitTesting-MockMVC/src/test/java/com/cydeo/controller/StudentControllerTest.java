package com.cydeo.controller;

import com.cydeo.dto.StudentDTO;
import com.cydeo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean                       //works with beans directly
    StudentService studentService;  // controller has a dependency with this service

    @Test
    void getStudent_Test() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/student")  //passing builder straight into method
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"firstName\": \"Mike\", \"lastName\":  \"Smith\", \"age\": 20}")) //object in Json format, but not a good structure
                .andDo(print())          // prints request in my console
                .andReturn();
    }
    @Test
    void jsonAssert_Test() throws Exception {  //

        String expected = "{\"firstName\": \"Mike\", \"lastName\":  \"Smith\", \"age\": 20}"; //not good(hardcoded)
        String actual = mvc.perform(MockMvcRequestBuilders.get("/student")         //real result
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse().getContentAsString();

        // expected -> {"firstName": "Mike", "lastName":  "Smith", "age": 20}
        // actual   -> {"firstName": "Mike", "lastName":  "Smith", "age": 20}

        JSONAssert.assertEquals(expected, actual, false);   // false -> as long as expected partially matches actual, strict, not a preferred way

    }

    @Test
    void getStudents_Test() throws Exception {

        when(studentService.getStudents()).thenReturn(Arrays.asList(         //
                new StudentDTO("John", "Doe", 20),
                new StudentDTO("Tom", "Hanks", 50)
        ));         // Creating my stub (behavior for my mock object/StudentService obj)

        mvc.perform(MockMvcRequestBuilders.get("/students")      //testing a controller method
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content()
                        .json("[{\"firstName\": \"John\", \"lastName\":  \"Doe\", \"age\": 20}" +   //this is a list
                                ", {\"firstName\": \"Tom\", \"lastName\":  \"Hanks\", \"age\": 50}]"))
                .andDo(print())   // to be able to see on console
                .andReturn();

    }





}
