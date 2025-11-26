package com.nov26.Day9_maven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet= new TreeSet<Integer>();
		treeSet.add(34);
		treeSet.add(12);
		treeSet.add(90);
		treeSet.add(56);
		 
		// floor and ceil.. nearest number downside present in the tree it will return
		//ceil: Like Greatest Integer Function.. just greater value from the tree than the given number
		
		System.out.println(treeSet);
		System.out.println(treeSet.ceiling(39));
		System.out.println(treeSet.floor(39));
		
		Iterator<Integer> itr=treeSet.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(treeSet.headSet(56));
		System.out.println(treeSet.tailSet(56));
		
		System.out.println(treeSet.higher(35));
		System.out.println(treeSet.higher(90));
		
		System.out.println(treeSet.higher(91));
		
		
		//Adding Student objects
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student(123, "swapna", 44, 90, "Hyderabad"));
		ts.add(new Student(124, "swetha", 44, 90, "Hyderabad"));
		ts.add(new Student(125, "swathi", 44, 90, "Hyderabad"));
		ts.add(new Student(126, "swarna", 44, 90, "Hyderabad"));
		
		for(Student i:ts)
			System.out.println(i);
		
		
		
	}
		

}
