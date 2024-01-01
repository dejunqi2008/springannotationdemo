package com.example.beandemo;

public class College {
    private Principle principle;

    public College(Principle principle) {
        this.principle = principle;
    }

    public Principle getPrinciple() {
        return principle;
    }

    public void setPrinciple(Principle principle) {
        this.principle = principle;
    }

    public void testCollege() {
        System.out.println("Testing this College object");
    }

    public void showCollegePrinciple(String name) {
        this.principle.showPrinciple(name);
    }
}
