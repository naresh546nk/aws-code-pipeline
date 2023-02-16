package com.example.awscodepieline.controller;


import com.example.awscodepieline.model.User;
import com.example.awscodepieline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Environment environment;


    @GetMapping("/")
    public String home(){
        return  "Application is running fine version: 1";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
}
