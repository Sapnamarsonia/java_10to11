package com.example.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	  @GetMapping("/greeting")
	    public String greet() {
	        return "Hello, World!";
	    }

}
