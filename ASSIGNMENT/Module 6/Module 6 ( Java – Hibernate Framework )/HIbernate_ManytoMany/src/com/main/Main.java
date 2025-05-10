package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Util.Util;
import com.entity.Course;
import com.entity.Student;

public class Main {

    public static void main(String[] args) {
        // Create Session
        Session session = Util.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            // Create Course
            Course course1 = new Course("Math");
            Course course2 = new Course("Physics");

            // Create Student
            Student student = new Student("Sapna");
            student.getCourses().add(course1);
            student.getCourses().add(course2);

            // Save Courses and Student
            session.save(course1);
            session.save(course2);
            session.save(student);

            // Commit Transaction
            transaction.commit();

            // Fetch and print student details
            Student savedStudent = session.get(Student.class, student.getId());
            System.out.println("Student: " + savedStudent.getName());
            for (Course c : savedStudent.getCourses()) {
                System.out.println("Enrolled in: " + c.getTitle());
            }

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        // Close SessionFactory
        Util.getSessionFactory().close();
    }
}
