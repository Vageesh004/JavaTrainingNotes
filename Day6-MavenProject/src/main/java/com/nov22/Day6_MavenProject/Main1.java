package com.nov22.Day6_MavenProject;

import java.util.Arrays;

public class Main1 {
	public static void main(String args[]) {
		/*PrintName c=()-> {
			System.out.println("Vageesh S");
		};
		
		c.printName();*/
		
		/*PrintName ni=(String str)->{
			System.out.println(new StringBuffer(str).reverse().toString());
		};
		
		ni.stringReverse("Vageesh");*/
		
		
		/*PrintName sq=(int[] arr)->{
			for(int i:arr) System.out.println(i*i);
			
		};
		
		int arr[]= {1,2,3,4,5};
		sq.squareNumber(arr);*/
		
		
		/*PrintName ni=(String str[])->{
			Arrays.sort(str);
			for(String i: str) {
				System.out.println(i);
			}
			
		};
		
		String[] str= {"swapna","amit","raj","banu"};
		ni.sortStrings(str);*/
		
		PrintName ni=(String[] arr)->{
			int lengths[]=new int[arr.length];
			for(int i:arr) {
				
			}
			
		};
				
				
		String[] arr= {"dhoni","kohli","rohit"};
		ni.findLength(arr);
		
	}
}
