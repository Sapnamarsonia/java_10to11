package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Person;

public class Select 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Id "); // get id 
		int id = sc.nextInt();					// save id 
		
		Person p = new Person();
		p.setId(id);
		
		Person p2 = new MyDao().selectdata(p);
		
		
		
				
	}

}
