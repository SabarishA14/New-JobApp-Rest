package com.sab.springbootreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootReactApplication {

    public static void main(String[] args) {
        System.out.println("Application started...");
        SpringApplication.run(SpringBootReactApplication.class, args);
        System.out.println("Application is Running...");
    }

}
