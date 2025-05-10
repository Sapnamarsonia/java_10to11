package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Employee;

public class Update 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Deparment");
		String Department = sc.next();
		
		System.out.println("Enter Your Salary");
		String Salary = sc.next();
	
		Employee p = new Employee();
		p.setId(id);
		p.setName(name);
		p.setDepartment(Department);
		p.setSalary(Salary);
		
		new MyDao().updatedata(p);
	}
	

}
