package com.acme.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext context =  SpringApplication.run(ExampleApplication.class, args);

        System.out.println("======================================================================");
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        System.out.println("======================================================================");

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        int count = 0;
        for (String beanName : beanNames) {
            System.out.printf("\t[%2d] = %s\n", count, beanName);
            ++count;
        }
        System.out.printf("\tcount=%d\n", count);
        System.out.println("======================================================================");
    }

}