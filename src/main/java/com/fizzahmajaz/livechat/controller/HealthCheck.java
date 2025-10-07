package com.fizzahmajaz.livechat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/healthcheck")
    public String healthcheck(){
        return "SpringBoot is working!";
    }
    
}
