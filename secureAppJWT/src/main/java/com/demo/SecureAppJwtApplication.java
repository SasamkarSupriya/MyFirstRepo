package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureAppJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureAppJwtApplication.class, args);
		
		System.out.println("Hello");
	}

}
