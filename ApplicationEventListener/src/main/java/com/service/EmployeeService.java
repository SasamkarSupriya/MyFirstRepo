package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import com.event.AddEmployeeEvent;
import com.model.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService implements ApplicationEventPublisherAware{
	
	@Autowired
	 EmployeeRepository repository;
	
	 ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
//	 public EmployeeService(EmployeeRepository repository) {
//		    this.repository = repository;
//		  }

		  public Employee create(Employee employee) throws Exception {
		    Employee newEmployee = repository.save(employee);
		    if (newEmployee != null) {
		      applicationEventPublisher.publishEvent(new AddEmployeeEvent(newEmployee));   //Notify the listeners
		      return newEmployee;
		    }
		    throw new Exception("Employee could not be saved");
		  }

}
