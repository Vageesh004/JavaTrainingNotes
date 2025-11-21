package com.nov21.Day1MavenProject;

public class StudentMain {

	public static void main(String[] args) {
		//non-static inner class
		Student s1=new Student(123,"Vageesh",90);
		//Student.clg c1=s1.new clg("abc clg","bglr",1234);
		
		
		Student s2=new Student(12,"amit",90);
		
		
		//static inner class
		Student.College c=s2.new College("xyz college","bglr");
		
		System.out.println(c);
		System.out.println(s1.c);
		
		
	}
}
