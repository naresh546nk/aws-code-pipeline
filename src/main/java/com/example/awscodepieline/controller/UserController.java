package com.example.awscodepieline.controller;


import com.example.awscodepieline.model.User;
import com.example.awscodepieline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Environment environment;


    @GetMapping("/")
    public Map<String,String> home(){
        Optional<String> hostname = Optional.ofNullable(System.getenv("HOSTNAME"));
        return  Map.of("status", "Application is running fine" ,
                "Host", hostname.get(),
                 "Version", "Version : "+3);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
}
