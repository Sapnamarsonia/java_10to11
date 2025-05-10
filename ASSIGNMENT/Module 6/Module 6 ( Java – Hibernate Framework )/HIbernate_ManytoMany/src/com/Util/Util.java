package com.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student;

public class Util 
{
    private static SessionFactory sessionFactory;

    static 
    {
        try 
        {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() 
    {
        return sessionFactory;
    }
}
