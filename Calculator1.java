package com.nov21.Day1MavenProject;

public class Calculator1 {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	

	public void add(String a, String b) {
		System.out.println(a+b);
	}


	public void add(long a, long b) {
		System.out.println(a+b);
	}
	
	//adding 2 complex nos
	//adding 2 fractions
	//adding 2 matrices
	public void add(ComplexNum c1,ComplexNum c2) {
		ComplexNum c3=new ComplexNum();
		
		c3.real=c1.real + c2.real;
		c3.imag = c1.imag + c2.imag;
		
		System.out.println(c3.real + "+i" + c3.imag);
	}
	public static void main(String args[]) {
		
		Calculator1 ca=new Calculator1();
		ca.add(5,8);
		ca.add("Vageesh","Sundar");
		
		ComplexNum c1=new ComplexNum(3,4);
		ComplexNum c2=new ComplexNum(5,6);
		ca.add(c1, c2);
		
	}
}
