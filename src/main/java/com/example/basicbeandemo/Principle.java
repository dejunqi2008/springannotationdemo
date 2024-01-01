package com.example.basicbeandemo;

public class Principle {
    private String name;

    public Principle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showPrinciple(String name) {
        this.setName(name);
        System.out.println("Principle name: " + this.getName());
    }
}
