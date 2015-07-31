package org.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootRESTApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootRESTApplication.class, args);
    }
}
