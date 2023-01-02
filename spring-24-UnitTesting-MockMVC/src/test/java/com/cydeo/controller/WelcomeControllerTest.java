package com.cydeo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



@WebMvcTest(WelcomeController.class)  //controller unit test, add class that needs a test
public class WelcomeControllerTest {
    @Autowired
    private MockMvc mvc;
    @Test
    void welcome_Test() throws Exception {  // this test is not a preferred way

        // call /welcome endpoint
        // verify if response is "welcome"

        RequestBuilder request = MockMvcRequestBuilders.get("/welcome")  //create a get request, call endpoint, returns RequestBuilder
                .accept(MediaType.APPLICATION_JSON) ;                               //header, accepting application Json

        // to send request we need MockMvc result
        MvcResult result = mvc.perform(request).andReturn();                        // sending a request and return

        // to verify if response is welcome
        assertEquals(200, result.getResponse().getStatus());               // import from JUnit, check if I have 200 in my response
        assertEquals("welcome", result.getResponse().getContentAsString());// to verify content if it's welcome
    }
    @Test
    void welcome_Test2() throws Exception {  // better to use, test in postman

        RequestBuilder request = MockMvcRequestBuilders.get("/welcome")  // no return
                .accept(MediaType.APPLICATION_JSON);

        mvc.perform(request)                                                        // perform a request
                .andExpect(status().isOk())                                         // expect status is ok -> comes from MockMvcResultMatchers
                .andExpect(content().string("welcome"))               // verify if response bode welcome
                .andReturn();                                                       // and return
    }







}
