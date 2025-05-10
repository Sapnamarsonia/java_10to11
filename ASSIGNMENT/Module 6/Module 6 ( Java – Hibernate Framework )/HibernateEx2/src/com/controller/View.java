package com.controller;

import java.util.List;

import com.dao.MyDao;
import com.model.Employee;

public class View 
{
	public static void main(String[] args) 
	{
		List<Employee>list = new MyDao().viewdata();
		
		for(Employee emp : list)
		{
			System.out.println(emp.getId()+"\t|\t"+emp.getName()+"\t|\t"+emp.getDepartment()+"\t|\t"+emp.getSalary());

		}
		
	}

}
