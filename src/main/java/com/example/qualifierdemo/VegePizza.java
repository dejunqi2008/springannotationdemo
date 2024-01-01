package com.example.qualifierdemo;

import org.springframework.stereotype.Component;

@Component
public class VegePizza implements Pizza{



    @Override
    public String getPizza() {
        return "Veg Pizza";
    }
}
