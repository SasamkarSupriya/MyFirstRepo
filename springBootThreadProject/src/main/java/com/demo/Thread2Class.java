package com.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;

@Configuration
public class Thread2Class {
	
	@Async
	public void fun2() {
		System.out.println("thread 2 is running");
		
		for(int i=0;i<100;i++) {
			System.out.println("Thread 2 ::"+i);
		}

	}

}
