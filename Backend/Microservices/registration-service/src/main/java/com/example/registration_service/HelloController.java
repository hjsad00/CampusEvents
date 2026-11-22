package com.example.registration_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/registrations/hello")
    public String hello() {
        return "Hello from registration-service";
    }
}
