package com.nov22.Day6_MavenProject;

import java.util.function.Function;

public class DemoOnFunction {
	public static void main(String[] args) {
		Function<Integer,Integer> squareFunction =(num)-> num* num;
		
		int arr[]= {3,2,5,7,1,9};
		for(int i=0;i<arr.length;i++) {
			System.out.println(squareFunction.apply(arr[i]));
		}
		

		/*Employee emp1=new Employee(101, "Alice", 90000),
        Employee emp2= new Employee(102, "Bob", 65000),
        Employee emp3= new Employee(103, "Carol", 78000),
        Employee emp4= new Employee(104, "Dave", 65000),
        Employee emp5= new Employee(105, "Eve", 105000)

        Employee[] empArr= {emp1,emp2,emp3,emp4,emp5};*/
		
		
		
		
		Function<Integer,Integer> add20=(num) -> num+20;
		
		System.out.println(squareFunction.andThen(add20).apply(5));
		
		Function<Employee, Employee> checkSalary=(e)->{
			if(e.getSalary()>50000)
				return e;
			
			else
				return null;
		};
	}
}
