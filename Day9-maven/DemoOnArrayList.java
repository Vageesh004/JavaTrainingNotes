package com.nov26.Day9_maven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {
	public static void main(String args[]) {

		/*
		 * ArrayList alist=new ArrayList(); alist.add(56); alist.add("Vageesh");
		 * alist.add(true); alist.add(89.78);
		 * 
		 * Person p=new Person("Vageesh",12345); alist.add(p);
		 * 
		 * System.out.println(alist); System.out.println(alist.get(2));
		 * alist.add(89.78);
		 * 
		 * System.out.println(alist); //maintains insertion order, duplicates allowed
		 * alist.add(null); alist.add(null); System.out.println(alist);
		 * 
		 * 
		 * ArrayList<String> namesList=new ArrayList<String>(); namesList.add("Amit");
		 * namesList.add("Preethi"); namesList.add("Varun"); namesList.add("Keerthi");
		 * 
		 * System.out.println("Using syso"); System.out.println(namesList);
		 * 
		 * System.out.println("enhanced for loop"); for(String name:namesList) {
		 * System.out.println(name); }
		 * 
		 * System.out.println("using Iterator"); Iterator<String>
		 * itr=namesList.iterator(); //it will be there before first element
		 * while(itr.hasNext()) System.out.println(itr.next());
		 * 
		 * System.out.println("using list iterator");
		 * 
		 * ListIterator<String> litr=namesList.listIterator(); //forward direction is
		 * similar to Iterator
		 * 
		 * System.out.println("Backward Direction"); while(litr.hasPrevious()) {
		 * System.out.println(litr.previous()); }
		 * 
		 * System.out.println(namesList.contains("amit"));
		 * 
		 * System.out.println("Foreach"); namesList.forEach(name ->
		 * System.out.println(name)); //consumer using lambda
		 * 
		 * namesList.forEach(System.out::println); //consumer using mr // we don't write
		 * functional interface..consumer is already defined.. //we write only lambda
		 * and method reference(mr)
		 * 
		 * 
		 * //System.out.println(namesList.remove(2));
		 * 
		 * //Retains all retains common elements of two collections and removes others
		 * Integer[] arr= {2,3,4,5,6,7}; Integer[] brr= {1,2,3,4,5};
		 * 
		 * List<Integer> numsList1=new ArrayList<Integer>(Arrays.asList(arr));
		 * List<Integer> numsList2=new ArrayList<Integer>(Arrays.asList(brr)); //why it
		 * worked only when // new ArrayList is included?? to avoid warnings (yellow
		 * line), include generics //in the new ArrayList<>
		 * 
		 * System.out.println("Before RetainsAll operation"+ numsList1);
		 * numsList1.retainAll(numsList2);
		 * 
		 * System.out.println("After RetainsAll operation"+ numsList1);
		 * 
		 * System.out.println("NamesList:" + namesList);
		 * 
		 * namesList.sort(null);
		 * 
		 * //we sort on the natural sorting order Collections.sort(namesList);
		 * System.out.println("After Sorting\n"+ namesList); //here if we have given
		 * fully small letters //like Preethi and amit, Preethi will print first..bcoz
		 * it's ASCII value is before..
		 * 
		 * //so the comprison for sorting is based on ASCII value
		 * 
		 * 
		 * ArrayList<String> clonedNamesList=(ArrayList<String>) namesList.clone();
		 * System.out.println(clonedNamesList.hashCode());
		 * System.out.println(namesList.hashCode());
		 * 
		 * 
		 * namesList.add("swpna"); System.out.println(clonedNamesList);
		 * 
		 * //use ArrayList for user defined type
		 */

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(123, "swapna", 44, 90, "Hyderabad"));
		studentList.add(new Student(324, "swathi", 67, 95, "Hyderabad"));

		studentList.add(new Student(125, "swetha", 44, 90, "Hyderabad"));
		studentList.add(new Student(126, "smit", 67, 95, "Hyderabad"));
		studentList.add(new Student(467, "smith", 44, 90, "Pune"));
		studentList.add(new Student(468, "warner", 44, 90, "Hyderabad"));

		studentList.add(new Student(661, "swapna", 44, 90, "Bangalore"));
		studentList.add(new Student(662, "swathi", 44, 90, "Hyderabad"));

		studentList.add(new Student(125, "swetha", 67, 95, "Chennai"));
		studentList.add(new Student(776, "smit", 67, 95, "Mumbai"));
		studentList.add(new Student(890, "smith", 44, 90, "Hyderabad"));
		studentList.add(new Student(468, "warner", 67, 95, "Delhi"));

		System.out.println(studentList);

		for (Student s : studentList)
			System.out.println(s);

		// Collections.sort(studentList);

		// Comparator are basically classes..
		studentList.sort(new CityComparator());
		System.out.println("after sorting");
		for (Student s : studentList)
			System.out.println(s);

		
		//2 
		
		studentList.sort(new CityComparator().thenComparing(new NameComparator()));
		 // after 2 parameter comparison
		System.out.println("after 2 parameter sorting");
		for(Student s:studentList) System.out.println(s);
		  
		 //3 studentList.sort(new CityComparator().thenComparing(new NameComparator())
		 //.thenComparing(new MarksComparator()));
		 
		 //for(Student s:studentList) System.out.println(s);
		 

	}

}
