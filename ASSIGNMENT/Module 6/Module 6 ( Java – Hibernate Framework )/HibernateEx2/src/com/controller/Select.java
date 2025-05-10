package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Employee;

public class Select 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Id "); // get id 
		int id = sc.nextInt();					// save id 
		
		Employee emp = new Employee();
		emp.setId(id);
		
		Employee emp2 = new MyDao().selectdata(emp);
		
		
		
				
	}

}
