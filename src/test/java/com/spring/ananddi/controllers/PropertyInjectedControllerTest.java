package com.spring.ananddi.controllers;

import com.spring.ananddi.Service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController=new PropertyInjectedController();
        propertyInjectedController.greetingService=new GreetingServiceImpl();

    }

    @Test
    void sayGreeting() {
        System.out.println(propertyInjectedController.sayGreeting());
    }
}