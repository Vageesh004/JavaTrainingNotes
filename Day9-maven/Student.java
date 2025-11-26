package com.nov26.Day9_maven;

public class Student implements Comparable<Student> {
	private int sid;
	private String sname;
	
	private int age;
	private double marks;

	private String city;
	


	public Student(int sid, String sname, int age, double marks, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.marks = marks;
		this.city = city;
	}

	
	public Student() {
		super();
	}

	
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", marks=" + marks + ", city=" + city
				+ "]";
	}
	
	@Override
	public int compareTo(Student s) {
		return this.sid- s.sid;  //we can compare 
	}
	
	/*@Override
	public int compareTo(Student s) {
		return this.sname.compareTo(s.sname);  //we can compare 
	}*/
	
	

}
