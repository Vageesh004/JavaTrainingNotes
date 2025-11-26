package com.nov26.Day9_maven;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
	public static void main(String[] args) {
		
		Integer[] irr= {56,34,23,89,66,90,12,33}; 
		LinkedList<Integer> ll=new LinkedList<Integer>(Arrays.asList(irr));
		
		
		//ll=(LinkedList<Integer>)Arrays.asList(irr);
		
		Iterator<Integer> itr=ll.descendingIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(ll.offer(95));
		
		System.out.println(ll);
		System.out.println(ll.peekLast());
		
		System.out.println(ll.poll()); //delete first element
		System.out.println(ll.pollLast());
		
		ll.pop();
		
		//offer inserts at last
		//pop and poll remove topmost element
		//peek insert at last
		
		//peek will only show the element
		//poll will remove the element
		
		
	}
	
}
