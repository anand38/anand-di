package com.spring.ananddi.controllers;

import com.spring.ananddi.Service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String sayGreeting(){
        return greetingService.greetUser();
    }
}
