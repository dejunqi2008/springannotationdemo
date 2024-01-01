package com.example.beandemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class College {
    private Principle principle;

    @Autowired
    public void setPrinciple(Principle principle) {
        this.principle = principle;
    }

    public Principle getPrinciple() {
        return principle;
    }

    public void testCollege() {
        System.out.println("Testing this College object");
    }

    public void showCollegePrinciple(String name) {
        this.principle.showPrinciple(name);
    }
}
