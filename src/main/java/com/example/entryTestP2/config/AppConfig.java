package com.example.entryTestP2.config;

import com.example.entryTestP2.controller.ThingController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    ThingController thingController(){
        return new ThingController();
    }
}
