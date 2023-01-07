package com.example.springbootazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String message(){
        return "My app is deployed in Azure! using devops pipeline";
    }
}
