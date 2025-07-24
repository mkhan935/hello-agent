package com.example.helloagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the Spring Boot application.  Running the main method
 * will bootstrap an embedded web server and start the application context.
 */
@SpringBootApplication
public class HelloAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloAgentApplication.class, args);
    }
}
