package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/greet")
public class Greet {

    @GetMapping
    public String getHello() {
        return "Hello, from Spring Boot";
    }

    @PostMapping
    public String postMethodName(@RequestBody String msg) {
        return "Got: " + msg;
    }

}