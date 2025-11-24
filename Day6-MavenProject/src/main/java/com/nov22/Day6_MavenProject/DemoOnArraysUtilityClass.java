package com.nov22.Day6_MavenProject;

import java.util.Arrays;

public class DemoOnArraysUtilityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,35,72,11,40,5};
		int [] brr= {35,72,11,5,40,10};
		
		String nums=(Arrays.toString(arr));
		System.out.println(nums);
		
		Arrays.sort(arr);
		System.out.println(arr);
		
		for(int ele:arr) {
			System.out.println(ele);
		}

		System.out.println(Arrays.binarySearch(arr,30));
		
		System.out.println(Arrays.equals(arr,brr));
		
		int[] crr=Arrays.copyOf(arr, 10); //we are fixing new size of crr
		
		for(int ele:crr) {
			System.out.println(ele);
		}
		
		Arrays.fill(arr, 78);
		for(int ele:arr) {
			System.out.println(ele);
		}
		
	}

}
