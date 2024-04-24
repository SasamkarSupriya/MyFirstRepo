package com.listener;

//import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.event.DeleteEmployeeEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DeleteEmployeeEventListener implements ApplicationListener<DeleteEmployeeEvent> {

  @Override
  public void onApplicationEvent(DeleteEmployeeEvent event) {
    //log.info(event.toString());
	  System.out.println(event.toString());
  }
}