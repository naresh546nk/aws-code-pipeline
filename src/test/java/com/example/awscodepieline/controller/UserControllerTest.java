package com.example.awscodepieline.controller;


import com.example.awscodepieline.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest
@ContextConfiguration(classes = {UserService.class, UserController.class})
public class UserControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void   getAllUserTest() throws Exception {
        String contentAsString = mockMvc.perform(
                MockMvcRequestBuilders.get("/users")
        )
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        Assertions.assertEquals(contentAsString.contains("Naresh Kumar"),true);
    }

}
