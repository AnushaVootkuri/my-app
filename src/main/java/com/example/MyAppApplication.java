package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyAppApplication {  // <-- this must match the file name
    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World from Maven + Jenkins!";
    }
}