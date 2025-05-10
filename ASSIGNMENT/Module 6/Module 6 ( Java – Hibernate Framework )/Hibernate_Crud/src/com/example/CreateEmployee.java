package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CreateEmployee {
    public static void main(String[] args) {
        Session session = Util.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setName("Demo Employee");
        emp.setDepartment("HR");
        emp.setSalary(50000);

        session.save(emp);
        tx.commit();
        session.close();

        System.out.println("Employee saved successfully!");
    }
}
