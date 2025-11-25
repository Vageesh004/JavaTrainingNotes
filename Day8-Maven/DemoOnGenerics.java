package com.nov25.Day8_maven;

import java.util.Arrays;

public class DemoOnGenerics {
	
	public static <T> void display(T data) {
		System.out.println(data);
	}
	
	public static<T extends Number,U extends Number> void add(T t1,U u1) {
		System.out.println(t1.doubleValue()+u1.doubleValue());
		
		System.out.println(t1.intValue()+u1.intValue());
	}
	
	public static void main(String args[]) {
		
		Container<String> c1=new Container<String>();
		c1.setItem("Vageesh");
		System.out.println(c1.getItem());
		
		Container<Student> c2=new Container<Student>();
		Student s=new Student();
		
		c2.setItem(s);
		System.out.println(c2.getItem());
		
		Container<Integer> c3=new Container<Integer>();
		c3.setItem(67);
		System.out.println(c3.getItem());
		
		Container<Integer[]> c4=new Container<Integer[]>();
		Integer[] irr= {45,67,90,11};
		
		c4.setItem(irr);
		System.out.println(Arrays.toString(c4.getItem()));*/
		
		Pair<String,Double> p1=new Pair<String,Double>("distance in km",7.5);
		System.out.println(p1);
		
		Pair<String,Double> p2=new Pair<String,Double>("weight in kg",6.0);
		System.out.println(p2);
		
		Pair<Integer,String> p3=new Pair<Integer,String>(12345,"Laptop");
		System.out.println(p3);
		
		Student s=new Student(234,"Amit","Java");
		
		Pair<Integer,Student> p4=new Pair<Integer,Student>(1,s);
		System.out.println(p4);
		
		
		Order<String> o1=new Order<String>("Laptop");
		Order<String> o2=new Order<String>("Mobile phone");
		System.out.println(o1);
		System.out.println(o2);
		
		Item item=new Item(12,"Laptop",50000);
		Order<Item> o3= new Order<Item>(item);
		
		System.out.println(o3);*/
		
		
		//create order for this item array
		
		Item item1=new Item(101,"Laptop",50000);
		Item item2=new Item(102,"Mobile",30000);
		
		Item irr[]= {item1,item2};
		
		Order<Item[]> o4=new Order<Item[]>(irr);
		
		System.out.println(Arrays.toString(irr));
		
		
		Integer nums[]= {4,5,6,7,8,9,0};
		String strs[]= {"str1","str2","str3","str4"};
		ArrayPrinter<Integer> ap1=new ArrayPrinter<>(nums);
		ArrayPrinter<String> ap2=new ArrayPrinter<>(strs);
		
		System.out.println(ap1);
		System.out.println(ap2);
		
		
		display("Vageesh");
		display(34);
		display(true);
		Item item=new Item(11,"Mobile",30000);
		display(item);
		
		add(30,40);
		
	}

}


List list = new ArrayList();
list.add("Hello");
String str = (String) list.get(0); // Manual casting required

Here, list.get(0) returns Object.
You must cast to String.
If you accidentally store an Integer and cast to String, you get a ClassCastException at runtime.


	
List<String> list = new ArrayList<>();
list.add("Hello");
String str = list.get(0); // No casting needed
