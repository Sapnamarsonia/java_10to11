package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Employee;

public class Delete 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // object of scanner 
		
		System.out.println("Enter your Id: "); // get id from user to delete the details
		int id = sc.nextInt(); // save id 
		
		Employee emp = new Employee(); // object of table 
		emp.setId(id); // set id 
		
		new MyDao().deletedata(emp);
		
		
		
				
	}

}
