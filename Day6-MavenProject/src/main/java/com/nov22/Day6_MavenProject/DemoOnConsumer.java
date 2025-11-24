package com.nov22.Day6_MavenProject;

import java.util.Arrays;
import java.util.function.Consumer;

// void accept(T t); //the default built in method of this interface

public class DemoOnConsumer {
	public static void main(String args[]) {
		
		/*Ques 1*/
		Consumer<Integer> squareConsumer=(num1)->{
			System.out.println(num1*num1);
		};
		
		squareConsumer.accept(5);
		
		/* Ques 2*/
		Consumer<Integer[]> sortConsumer=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		
		Integer arr[]= {45,23,78,12,99,42,1};
		sortConsumer.accept(arr);
		
		
		/* Ques 3*/
		// I don't have the Employee class
		/*Employee[] employees=new Employee[] {

				new Employee("Alice", 90000),
	            new Employee("Bob", 60000),
	            new Employee("Carol", 75000),
	            new Employee("Dave", 60000)

		};
		
		Consumer<Employee[]> printConsumer=(err)->{
			for(Employee e:err) {
				System.out.println(e.getEmpName());
			}
		};
		
		printConsumer.accept(empArr);*/

	}

}
