package com.example.projec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @GetMapping("/name")
    public String name(){
        return "My name is  Alanoud";
    }

    @GetMapping("/Age")
    public String Age(){
    return"My age is 23";
    }

    @GetMapping("/check")
    public String check(){
        return"Everything OK";
    }

    @GetMapping("/health")
    public String health(){
        return"Server health is up and running";
    }

}