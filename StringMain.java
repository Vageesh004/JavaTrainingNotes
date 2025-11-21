package com.nov21.Day1MavenProject;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		System.out.println(s.hashCode());
		s="helloworld";
		
		System.out.println(s.hashCode());
		String s1="hello";
		
		System.out.println(s1.hashCode());
		
		String s2=new String("hello");
		System.out.println(s2.hashCode());
		
		System.out.println(s.length());
		System.out.println(s.indexOf('w'));
		
		String s3="Mphasis";
		s2.concat(s3);
		System.out.println(s2);  //it will not change s2 or s3..
		//the result is a 3 rd object, Hello Mphasis
		
		System.out.println(s1==s2); //false ..this is reference..this is address
		//this would be different
		
		System.out.println(s1.equals(s2)); //value comparison.. this is same...
		
		System.out.println(s.substring(5,10));  //starting to ending index
		
		// s1 and s2 are addresses stored in stack
		//so they are different..
		//but s1.equals(s2) means.. they refer to the same variable area 
		//i.e hello stored in the heap
		
		
		
	}

}
