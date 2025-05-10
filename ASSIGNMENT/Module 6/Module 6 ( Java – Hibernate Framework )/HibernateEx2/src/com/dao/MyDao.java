package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Employee;

public class MyDao 
{
	//method for insertdata
	public void insertdata(Employee emp)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.save(emp);
		tr.commit();
		sess.close();
	}

	// method for deletedata
	public void deletedata(Employee emp) 
	{
		// TODO Auto-generated method stub
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.delete(emp);
		tr.commit();
		sess.close();
		
	}
	// method for update
	public void updatedata(Employee emp)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.update(emp);
		tr.commit();
		sess.close();
	}

	// method for view data
	public List<Employee> viewdata()
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		List<Employee> getall = sess.createQuery("from Employee").list();
		tr.commit();
		sess.close();
		return getall;
	}
	public Employee selectdata(Employee emp) 
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		Employee emp1 = (Employee) sess.get(Employee.class, emp.getId());
		tr.commit();
		sess.close();
		
		// TODO Auto-generated method stub
		return emp1;
	}
	

}
