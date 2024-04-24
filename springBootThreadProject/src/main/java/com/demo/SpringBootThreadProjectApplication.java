package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootThreadProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThreadProjectApplication.class, args);
		System.out.println("Main thread...");		
	}

}
