package com.example.awscodepieline.service;

import com.example.awscodepieline.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUser(){
       return  List.of(
               User.builder()
               .id("1")
               .name("Naresh Kumar")
               .build(),
               User.builder()
                       .id("2")
                       .name("Ramesh Kumar")
                       .build()
       ) ;
    }
}
