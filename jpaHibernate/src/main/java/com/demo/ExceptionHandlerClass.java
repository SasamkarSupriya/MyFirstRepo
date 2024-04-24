package com.demo;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ExceptionHandlerClass {
	
	@ExceptionHandler(value=NoUserFoundException.class)
	public ResponseEntity<ApiError> handleNoUserFoundException() {
		
		ApiError apiError = new ApiError(400,"No Student Found", new Date());
		
		return  new ResponseEntity<ApiError>(apiError, HttpStatus.BAD_REQUEST);
		}

}
