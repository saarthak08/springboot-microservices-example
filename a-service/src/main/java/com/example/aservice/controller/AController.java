package com.example.aservice.controller;

import com.example.aservice.service.BService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class AController {

    BService bService;

    @Autowired
    public AController(BService bService) {
        this.bService=bService;
    }


    @GetMapping("/greet")
    public String greet() {
        return "Hi from A!";
    }

    @GetMapping("/combined-greet")
    public String combinedGreet() {
        return bService.greet() + "\nHi from A!";
    }


}
