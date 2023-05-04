package com.example.hellboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {
    @GetMapping("/")
    public String TestGet(String id){
        return id+" come?";
    }
}
