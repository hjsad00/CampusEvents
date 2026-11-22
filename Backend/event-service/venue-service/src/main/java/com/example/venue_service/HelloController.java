package com.example.venue_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/venues/hello")
    public String hello() {
        return "Hello from venue-service";
    }
}
