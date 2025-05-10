package com.example;

import org.hibernate.Session;
import java.util.List;

public class ReadEmployee {
    public static void main(String[] args) {
        Session session = Util.getSessionFactory().openSession();

        List<Employee> employees = session.createQuery("from Employee").list();

        for (Employee e : employees) {
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + 
                               ", Dept: " + e.getDepartment() + ", Salary: " + e.getSalary());
        }

        session.close();
    }
}
