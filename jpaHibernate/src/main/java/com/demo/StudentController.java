package com.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
	
	@Autowired
	StudentService student;
	
	@GetMapping("/set")
	public String saveStudent() {
		student.studentAndLaptop();
		return "Object Set";
	}
	
	@GetMapping("/get/{id}")
	public Optional<Student> getStudent(@PathVariable long id) {
		
		return student.getStudentByid(id);
	}

}
