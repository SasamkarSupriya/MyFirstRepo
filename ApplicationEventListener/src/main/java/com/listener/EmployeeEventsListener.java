package com.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.event.AddEmployeeEvent;
import com.event.DeleteEmployeeEvent;

//@Slf4j
@Component
public class EmployeeEventsListener {

	 @EventListener
	  void handleAddEmployeeEvent(AddEmployeeEvent event) {
		 System.out.println("Inside handle add emp listener...");
	   // log.info(event.toString());
	    System.out.println(event.toString());
	  }

	  @EventListener
	  void handleDeleteEmployeeEvent(DeleteEmployeeEvent event) {
	    //log.info(event.toString());
	    System.out.println(event.toString());
	  }
	
}
