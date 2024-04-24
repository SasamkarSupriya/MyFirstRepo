package com.event;

import org.springframework.context.ApplicationEvent;

import com.model.Employee;

public class DeleteEmployeeEvent extends ApplicationEvent{

	  public DeleteEmployeeEvent(Employee employee) {
		    super(employee);
		  }

		  @Override
		  public String toString() {
		    return "ApplicationEvent: Employee Deleted :: " + this.getSource();
		  }

	
}
