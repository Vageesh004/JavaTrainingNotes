package com.dec8Hibernate.Dec8_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.Query;

import dec8Hiber.model.Student;

import dec8Hiber.util.HibernateUtil;

public class Main {
	
	public static void main(String args[]) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		
		//addStudent()
		session.save(new Student(127,"amitraj","spring"));
		session.save(new Student(123,"anand","spring"));
		session.save(new Student(125,"swapna","java"));
		session.save(new Student(129,"swetha","spring"));
		
		//after adding,comment it..else error will show
		
		
		//get all students
		List<Student> studList=session.createQuery("From Student",Student.class).list();
		studList.forEach(System.out::println);
		
		
		//getAllStudentsByCourse()
		System.out.println("Student list with java course");
		Query<Student> q1=session.createQuery("From Student where course=:c");
		q1.setParameter("c","java");
		
		q1.list().forEach(System.out::println);
		
		
		//getAllStudents whose name starts with 'a'
		Query<Student> q2=session.createQuery("From Student where sname like 'a%'");
		q2.list().forEach(System.out::println);
		
		Query<Student> q3=session.createQuery("select count(*) from Student");
		studList.forEach(s->System.out.println(s.getSid() + " " + s.getSname()));
		System.out.println(q3.uniqueResult());
		
		Query<Object[]> q4=session.createQuery("select course,count(course) from Student group by course");
		q4.list().forEach(s->System.out.println(s[0]+ " "+s[1]));
		
		Query<Student> q5=session.createNamedQuery("Student.findAll",Student.class);
		System.out.println("--------Using Named Query------");
		q5.list().forEach(System.out::println);
		
		
		Query<Student> q6=session.createNamedQuery("Student.findByCourse",Student.class);
		q6.setParameter("c", "spring");
		q6.list().forEach(System.out::println);
		
		Query<Long> q7=session.createNamedQuery("Student.count",Long.class);
		System.out.println(q7.uniqueResult());
		
		
		//System.out.println("---Count of students in each course using Named query---");
		//Query<Object[]> q8=session.createNamedQuery("Student.groupByCourse",Object[])
		
		transaction.commit();
		session.close();
	}

}
