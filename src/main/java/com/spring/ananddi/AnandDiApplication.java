package com.spring.ananddi;

import com.spring.ananddi.controllers.MyController;
import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnandDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(AnandDiApplication.class, args);
        MyController myController= (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());
    }

}
