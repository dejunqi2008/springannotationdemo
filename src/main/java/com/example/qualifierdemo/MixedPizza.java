package com.example.qualifierdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MixedPizza implements Pizza{

    private MeatPizza meatPizza;

    private VegePizza vegePizza;

    public MeatPizza getMeatPizza() {
        return meatPizza;
    }

    @Autowired
    public void setMeatPizza(MeatPizza meatPizza) {
        this.meatPizza = meatPizza;
    }

    public VegePizza getVegePizza() {
        return vegePizza;
    }

    @Autowired
    public void setVegePizza(VegePizza vegePizza) {
        this.vegePizza = vegePizza;
    }

    @Override
    public String getPizza() {
        return this.meatPizza.getPizza() + ", " + this.vegePizza.getPizza();
    }
}
