package com.example.springannotationdemo;

import com.example.beandemo.BeanDemoConfig;
import com.example.beandemo.College;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringannotationdemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello world");
        // SpringApplication.run(SpringannotationdemoApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanDemoConfig.class);
        College college = context.getBean("getCollege", College.class);
        college.testCollege();
        college.showCollegePrinciple("MBBS");
    }

}
