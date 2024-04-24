package com.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student studentAndLaptop() {
		
		Book book = new Book();
		book.setBookid(5);
		book.setBookname("Algebra");
				
		Student std = new Student();
		std.setId(107);
		std.setLastname("sasamkar");
		std.getBook().add(book);
		
		return repository.save(std);
		
	}
	
	public Optional<Student> getStudentByid(long id) {
		
		if(id == 107) {
			
		return repository.findById(id);
		}
		else {
			
		}
		throw new NoUserFoundException("No User Found!!");
	}

}
