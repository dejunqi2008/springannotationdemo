package com.example.qualifierdemo;


import org.springframework.stereotype.Component;

@Component
public class MeatPizza implements Pizza {
    @Override
    public String getPizza() {
        return "Meat Pizza";
    }
}
