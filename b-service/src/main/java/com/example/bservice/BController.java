package com.example.bservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class BController {

    @GetMapping("/greet")
    public String greet() {
        return "Hi from B!";
    }



}
