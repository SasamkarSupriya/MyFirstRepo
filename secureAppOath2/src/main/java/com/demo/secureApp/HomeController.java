package com.demo.secureApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {
	
	@Autowired
    SecurityConfig sc;
	
	 @GetMapping("/")
	    public String home() {
	        return "Hello, home!";
	    }

	    @GetMapping("/secured")
	    public String secured() {
	        return "Hello, secured!";
	    }

}
