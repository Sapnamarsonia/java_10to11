package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateEmployee {
    public static void main(String[] args) {
        Session session = Util.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        int employeeId = 1;
        Employee emp = (Employee) session.get(Employee.class, employeeId);

        if (emp != null) {
            emp.setSalary(60000);
            session.update(emp);
            tx.commit();
            System.out.println("Employee salary updated!");
        } else {
            System.out.println("Employee not found.");
        }

        session.close();
    }
}
