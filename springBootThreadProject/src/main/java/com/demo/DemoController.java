package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	Thread1Class thread1;
	
	@Autowired
	Thread2Class thread2;
	
	@Autowired
	ServiceClass service;
	
	
	@RequestMapping("get")
	public String seeresult() throws InterruptedException {
			
	service.servicefun();
	Thread.sleep(1000);
	thread1.fun1();
	thread2.fun2();
	
	return "Controller done";
	}

}
