package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Tells Spring this handles REST endpoints
public class appController {
    @GetMapping("/") // Maps HTTP GET requests to this method
    public String sayHello() {
        return "Hello, World! Hello";
    }


}



