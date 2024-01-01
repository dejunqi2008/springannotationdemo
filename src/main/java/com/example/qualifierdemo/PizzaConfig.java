package com.example.qualifierdemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    public Pizza getMeatPizza() {
        return new MeatPizza();
    }

    @Bean Pizza getVegePizza() {
        return new VegePizza();
    }

    @Bean
    public Pizza getMixedPizza() {
        return new MixedPizza();
    }
}
