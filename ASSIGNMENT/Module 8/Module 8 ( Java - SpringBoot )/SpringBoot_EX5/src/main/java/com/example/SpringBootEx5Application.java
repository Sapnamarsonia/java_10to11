package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.MyService;

@SpringBootApplication
public class SpringBootEx5Application implements CommandLineRunner {
	 @Autowired
	    private MyService myService;
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEx5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
        myService.performTask();

	}

}
