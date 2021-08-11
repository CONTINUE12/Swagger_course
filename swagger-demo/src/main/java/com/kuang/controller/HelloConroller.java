package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConroller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/getUser")
    public User getUser(){
        return new User();
    }

}
