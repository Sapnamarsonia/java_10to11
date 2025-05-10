package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteEmployee {
    public static void main(String[] args) {
        Session session = Util.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        int employeeId = 1;
        Employee emp = (Employee) session.get(Employee.class, employeeId);

        if (emp != null) {
            session.delete(emp);
            tx.commit();
            System.out.println("Employee deleted!");
        } else {
            System.out.println("Employee not found.");
        }

        session.close();
    }
}
