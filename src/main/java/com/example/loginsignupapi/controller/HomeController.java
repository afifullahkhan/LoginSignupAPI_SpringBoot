package com.example.loginsignupapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adminuser")
public class HomeController {
    @GetMapping("/home")
    public String sayHello(){
        return "Hello World";
    }
}
