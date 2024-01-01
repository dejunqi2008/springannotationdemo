package com.example.basicbeandemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDemoConfig {

    @Value("${getPrinciple.name}")
    private String principleName;

    @Bean
    public Principle getPrinciple() {
        return new Principle(principleName);
    }

    @Bean
    public College getCollege() {
        return new College();
    }
}
