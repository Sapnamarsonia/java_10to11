package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Person;

public class Update 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Surname");
		String surname = sc.next();
	
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setSurname(surname);
		
		new MyDao().updatedata(p);
	}
	

}
