package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public void doSomething() throws InterruptedException {
        Thread.sleep(500); // Simulate processing
        System.out.println("Doing something...");
    }

    public void doAnotherThing() throws InterruptedException {
        Thread.sleep(300);
        System.out.println("Doing another thing...");
    }
}
