package main;

import entity.*;
import util.HibernateUtil;
import org.hibernate.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        // INSERT
        Transaction tx = session.beginTransaction();

        Department dept = new Department();
        dept.setName("IT");

        Profile profile = new Profile();
        profile.setPhone("9876543210");
        profile.setPhotoUrl("img.jpg");

        Project p1 = new Project();
        p1.setTitle("Inventory System");

        Employee emp = new Employee();
        emp.setName("Demo");
        emp.setSalary(60000);
        emp.setDepartment(dept);
        emp.setProfile(profile);
        emp.setProjects(Arrays.asList(p1));

        dept.getEmployees().add(emp);
        p1.getEmployees().add(emp);

        session.save(dept);
        session.save(p1);
        session.save(emp);

        tx.commit();

        // READ
        System.out.println("All Employees:");
        session.createQuery("from Employee").list()
            .forEach(e -> System.out.println(((Employee) e).getName() + " | " + ((Employee) e).getSalary()));

        // UPDATE
        tx = session.beginTransaction();
        Employee e = session.get(Employee.class, emp.getId());
        e.setSalary(70000);
        session.update(e);
        tx.commit();

        // DELETE
        tx = session.beginTransaction();
        session.delete(e);
        tx.commit();

        session.close();
    }
}
