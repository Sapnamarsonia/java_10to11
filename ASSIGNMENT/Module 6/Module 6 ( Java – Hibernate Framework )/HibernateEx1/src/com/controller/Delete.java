package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Person;

public class Delete 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // object of scanner 
		
		System.out.println("Enter your Id: "); // get id from user to delete the details
		int id = sc.nextInt(); // save id 
		
		Person p = new Person(); // object of table 
		p.setId(id); // set id 
		
		new MyDao().deletedata(p);
		
		
		
				
	}

}
