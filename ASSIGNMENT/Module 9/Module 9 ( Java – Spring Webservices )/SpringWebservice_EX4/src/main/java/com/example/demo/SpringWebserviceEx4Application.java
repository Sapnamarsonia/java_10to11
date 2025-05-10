package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.SampleService;

@SpringBootApplication
public class SpringWebserviceEx4Application implements CommandLineRunner
{
	@Autowired
    private SampleService sampleService;


	public static void main(String[] args) {
		SpringApplication.run(SpringWebserviceEx4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
		 sampleService.doSomething();
	     sampleService.doAnotherThing();
		
	}

}
