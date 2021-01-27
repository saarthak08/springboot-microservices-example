package com.example.aservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "b-service")
public interface BService {
    @GetMapping("/hello/greet")
    String greet();


}
