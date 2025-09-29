package com.example.zidio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.entity")
@ComponentScan(basePackages = {"com.example.zidio","com.example.security","com.example.controller","com.example.service"})
@EnableJpaRepositories(basePackages = "com.example.repository")
public class ZidioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZidioApplication.class, args);
    }

}
