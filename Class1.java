package com.nov21.Day1MavenProject;

public class Class1 implements Interface1,Interface2{
	@Override
	public void sayHello() {
		//to avoid diamond problem, we go to interface related sayHello method
		Interface2.super.sayHello();
	}
	
	public static void main(String args[]) {
	
	Class1 c1=new Class1();
	c1.sayHello();
	
	//Interface does not have objects...can't put new here
	Interface1 i1=new Class1();
	i1.sayHello();
	
	Interface2 i2=new Class1();
	i2.sayHello();
	
	}
}
