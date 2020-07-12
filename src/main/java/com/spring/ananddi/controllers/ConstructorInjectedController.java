package com.spring.ananddi.controllers;

import com.spring.ananddi.Service.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayGreeting(){
        return greetingService.greetUser();
    }
}
