package com.spring.ananddi.controllers;

import com.spring.ananddi.Service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
    setterInjectedController=new SetterInjectedController();
    setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(setterInjectedController.sayGreeting());
    }
}