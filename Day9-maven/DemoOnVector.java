package com.nov26.Day9_maven;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {
	
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		
		System.out.println(vector.capacity());
		
		for(int i=1;i<=10;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());
		
		vector.add(11);
		System.out.println(vector.capacity());
		
		System.out.println("Converting Vector enumeration and printing collection");
		Enumeration<Integer> enums=vector.elements();
		while(enums.hasMoreElements())
			System.out.println(enums.nextElement());
		
		System.out.println("Using Iterator to print collection");
		Iterator<Integer> itr=vector.iterator();
		
		while(itr.hasNext()) {
			int num=itr.next();
		
			if(num%3==0)
				itr.remove();
			System.out.println(num);
		}
		
		System.out.println(vector);
		
		//we use iterator than normal for each or any other bcoz there is no concurrent modification
		//but in iterator itself, we can remove it...then in vector also it is getting removed
		
	}

}
