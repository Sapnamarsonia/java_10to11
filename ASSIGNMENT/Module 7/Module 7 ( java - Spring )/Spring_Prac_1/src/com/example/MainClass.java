package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the beans
        Person person = (Person) context.getBean("person");
        Car car = (Car) context.getBean("car");

        // Display bean properties
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        System.out.println("Car: " + car.getModel() + ", Color: " + car.getColor());
    }

}
