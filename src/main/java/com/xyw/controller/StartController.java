package com.xyw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {

    @GetMapping("/demo1")
    public String quickStart01(){
        System.out.println("quickStart01...");
        return "hello boot!";
    }
}