package com.nov22.Day6_MavenProject;

import java.util.function.Function;
import java.util.function.Supplier;

public class LamXMRQue {
	
	public static void main(String args[]) {
		
		
		
		/*for(String i:arr) {
			Supplier<String> filterUsingLambda=()->arr[i].filterStrings();
		}*/
		
		String[] arr= {"Abishek","Ajay","Irfan","Vageesh"};
		Assignment a=new Assignment();
	
		
		Function<String,String> filterUsingOMR = a::filterStrings;
		
		
		for(String i:arr) {
			System.out.println(filterUsingOMR.apply(i));
		}
		
		
		
	}
	
	

}

class Assignment{
	public String filterStrings(String str) {
		if(str.startsWith("A")) {
			return str;
		}
		return "no";
	}
	
	
}