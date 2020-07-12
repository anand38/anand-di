package com.spring.ananddi.controllers;

import com.spring.ananddi.Service.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayGreeting(){
        return greetingService.greetUser();
    }
}
