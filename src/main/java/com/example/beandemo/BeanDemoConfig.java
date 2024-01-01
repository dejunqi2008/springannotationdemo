package com.example.beandemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDemoConfig {

    @Value("${getPrinciple.name}")
    private String principleName;

    @Value("$getCollege.principle")
    private Principle principle;


    @Bean
    public Principle getPrinciple() {
        return new Principle(principleName);
    }

    @Bean
    public College getCollege() {
        return new College(principle);
    }
}
