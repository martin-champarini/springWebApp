package com.example.guru.springframework.springWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebAppApplication implements CommandLineRunner {

    @Autowired
    private String username;

    @Autowired
    @Qualifier("getOtherUsername")
    private String otherUsername;

    public static void main(String[] args) {
        SpringApplication.run(SpringWebAppApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Username ="+ username);
        System.out.println("Other Username ="+ otherUsername);
    }
}