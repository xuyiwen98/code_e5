package com.xyw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {

    @GetMapping("/demo1")
    public String quickStart01() {
        System.out.println("quickStart01...");
        return "hello boot!";
    }

    @GetMapping("/demo2")
    public String quickStart02() {
        System.out.println("quickStart02...");
        return "hello boot!";
    }

    @GetMapping("/demo3")
    public String quickStart03() {
        System.out.println("quickStart03...");
        return "hello boot!";
    }

    @GetMapping("/demo4")
    public String quickStart04() {
        System.out.println("quickStart...");
        return "hello boot!";
    }

    @GetMapping("/demo5")
    public String quickStart05() {
        System.out.println("quickStart...");
        return "hello boot!";
    }

    @GetMapping("/demo6")
    public String quickStart06() {
        System.out.println("quickStart...");
        return "hello boot!";
    }

    @GetMapping("/demo7")
    public String quickStart07() {
        System.out.println("quickStart...");
        return "hello boot!";
    }

}
