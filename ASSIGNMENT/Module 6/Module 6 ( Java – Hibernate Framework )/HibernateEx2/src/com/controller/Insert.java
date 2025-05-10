package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Employee;

public class Insert 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name ");
		String name = sc.next();
		
		System.out.println("Enter Your Department ");
		String Department = sc.next();
		
		System.out.println("Enter Your Salary ");
		String Salary = sc.next();
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.setDepartment(Department);
		emp.setSalary(Salary);
		
		new MyDao().insertdata(emp);
		
		
	}

}
