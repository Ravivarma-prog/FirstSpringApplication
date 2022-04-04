package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstWebAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello Ravi");
		SpringApplication.run(FirstWebAppApplication.class, args);
	}

}
