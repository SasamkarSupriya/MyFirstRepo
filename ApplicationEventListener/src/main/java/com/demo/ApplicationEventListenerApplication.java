package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.model.Employee;
import com.service.EmployeeService;


@SpringBootApplication
public class ApplicationEventListenerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEventListenerApplication.class, args);
	}

	 @Autowired
	  EmployeeService employeeService;

	  @Override
	  public void run(String... args) throws Exception {

	    employeeService.create(new Employee("Lokesh Gupta"));
	    //log.info("New Employee Created...");
	    System.out.println("New Employee Created...");
	  }
}
