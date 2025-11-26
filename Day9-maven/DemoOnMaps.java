package com.nov26.Day9_maven;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Hashtable;

public class DemoOnMaps {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1,"hyd");
		hashMap.put(43, "bglr");
		hashMap.put(23, "chennai");
		hashMap.put(3,"delhi");
		
		System.out.println(hashMap);
		
		hashMap.put(3,"pune");
		System.out.println(hashMap);
		
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		System.out.println(hashMap.entrySet());
		
		//if we change the value for a key, it overwrites with the recently overwritten value
		//in random order only, it prints..either in map, or in the set
		
		System.out.println(hashMap.get(3));
		
		System.out.println(hashMap.getOrDefault(13, "Madurai"));
		
		Set<Integer> keySet=hashMap.keySet();
		//Set<String> valueSet=(Set<String>) hashMap.values();
		Set<String> valueSet=new HashSet<String>(hashMap.values());
		System.out.println(valueSet);
		
		//Collection type also got accepted by valueSet.. but keySet directly 
		//accepts Set..so no type casting
		
		
		Iterator<Integer> keyItr= keySet.iterator();
		
		while(keyItr.hasNext())
			System.out.println(keyItr.next());
		
		Iterator<Entry<Integer,String>> entryItr=hashMap.entrySet().iterator();
		while(entryItr.hasNext())
			System.out.println(entryItr.next());
		
		//TreeMap
		TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
		
		treeMap.put(1, 1);
		treeMap.put(2, 4);
		treeMap.put(7, 49);
		treeMap.put(4, 16);
		treeMap.put(12,144);
		System.out.println(treeMap);
		
		System.out.println(treeMap);
		System.out.println(treeMap.ceilingEntry(5));
		
		System.out.println(treeMap.descendingMap());
		
		
		//Hash Table
		//it also comes under legacy..Enumeration comes for legacy ones
		
		Hashtable<Integer,String> table=new Hashtable<Integer,String>();
		table.put(3, "swapna");
		table.put(2,"amit");
		table.put(8,"Rio");
		table.put(7,"Raj");
		
		System.out.println(table);
		
		Enumeration<Integer> keys=table.keys();
		
		while(keys.hasMoreElements())
			System.out.println(keys.nextElement());  //it will print in bucket order..
		//i.e insertion order 
		
		//mam is saying no descending order...but it comes in descending order for all
		Enumeration<String> values= table.elements();
		while(values.hasMoreElements())
			System.out.println(values.nextElement());
		
		
		
		
	}

}
