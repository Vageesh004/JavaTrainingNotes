package com.nov22.Day6_MavenProject;

import java.util.function.Predicate;

public class DemoOnPredicate {
	
	public static void main(String args[]) {
	
		Predicate<Integer> isEven=(n)-> n%2==0;
		System.out.println(isEven.test(56));
		
		if(isEven.test(35))
			System.out.println("even");
		else
			System.out.println("odd");
		
		
		Predicate<String> checkLength=(s)->s.length()>7;
		System.out.println(checkLength.test("Vageesh"));
		
		
		/*Predicate<Employee[]> checkSalary=(emp)->{
			return emp.getSalary()>=50000;
		};
		
		for(Employee e:empArr){
			if(checkSalary.test(e))
				System.out.println(e);
		}*/
	}

}
