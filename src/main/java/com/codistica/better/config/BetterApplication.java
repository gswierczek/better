package com.codistica.better.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.codistica.better")
public class BetterApplication {
	public static void main(String[] args) {
		SpringApplication.run(BetterApplication.class, args);
	}
}
