package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args)
	{
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Person per = (Person) acm.getBean("t1");
		System.out.println(per.getId()+" "+per.getName());
		
		Person per1 = (Person) acm.getBean("t1");
		
		per.setId(102);
		per.setName("ABC");
		
		System.out.println(per.getId()+" "+per.getName());
		System.out.println(per1.getId()+" "+per1.getName());

	}

}
