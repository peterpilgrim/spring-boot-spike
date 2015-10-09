package com.acme.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ppilgrim on 08-Oct-2015.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloGreeting() {
        return "Hello World - Greetings from Spring Boot!";
    }

}