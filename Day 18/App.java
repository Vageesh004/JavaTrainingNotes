package com.dec8Hibernate.Dec8_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import dec8Hiber.model.Student;
import dec8Hiber.util.HibernateUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Student s=new Student(123,"Vageesh","Java");
        session.save(s);
        
        System.out.println("added successfully");
        tx.commit();
        
        
        //retreive all student
        List<Student> studList=session.createQuery("From Student",Student.class).list();
        for(Student s1:studList)
        	System.out.println(s1);
        
        session.close();
        factory.close();
        
        
    }
}
