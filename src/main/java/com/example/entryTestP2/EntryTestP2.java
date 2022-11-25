package com.example.entryTestP2;

import com.example.entryTestP2.controller.ThingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EntryTestP2 {

    public static void main(String[] args) {
//        SpringApplication.run(EntryTestP2.class, args);
        ApplicationContext context = SpringApplication.run(EntryTestP2.class, args);
        ThingController thingController = context.getBean(ThingController.class);
        thingController.showMenu();
    }

}
