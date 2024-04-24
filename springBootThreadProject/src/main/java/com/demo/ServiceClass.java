package com.demo;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {

	public String servicefun() {
		
		for(int i=0;i<1000;i++) {
			System.out.println("In service class..."+i);
			
		}
		return "service done";
	}
	
}
