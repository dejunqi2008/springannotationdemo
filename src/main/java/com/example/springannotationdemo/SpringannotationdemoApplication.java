package com.example.springannotationdemo;

import com.example.basicbeandemo.BeanDemoConfig;
import com.example.basicbeandemo.College;
import com.example.qualifierdemo.MixedPizza;
import com.example.qualifierdemo.Pizza;
import com.example.qualifierdemo.PizzaConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringannotationdemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello world");
        // SpringApplication.run(SpringannotationdemoApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
        Pizza pizza = context.getBean("getMixedPizza", MixedPizza.class);
        System.out.println(pizza.getPizza());
    }

}
