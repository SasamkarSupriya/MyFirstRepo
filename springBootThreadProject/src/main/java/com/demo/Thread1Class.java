package com.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Component;


@Component
public class Thread1Class {
	
	
	public void fun1() {
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("thread1 is running");
				
				for(int i=0;i<100;i++) {
					System.out.println("Thread1 ::"+i);
				}
			}
			
		});
		
	}

}
