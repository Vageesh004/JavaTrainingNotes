package com.nov22.Day6_MavenProject;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;


public class DemoOnObjectMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myname="Vageesh";
		Supplier<Integer> lengthUsingLambda=()-> myname.length();
		
		Supplier<Integer> lengthUsingMR=myname::length;
		
		System.out.println(lengthUsingLambda.get());
		System.out.println(lengthUsingMR.get());
		
		
		Hello h=new Hello();
		Supplier<String> helloUsingLambda=() -> h.sayHello();
		Supplier<String> helloUsingMR=h::sayHello;
		
		System.out.println(helloUsingLambda.get());
		System.out.println(helloUsingMR.get());
		

		//for NumberUtil class
		
		NumberUtilMR nu=new NumberUtilMR();
		Predicate<Integer> isEvenUsingMr= nu::isEven;
		System.out.println(isEvenUsingMr.test(45));
		
		Function<Integer,Integer> squareNumber= nu::squareNumber;
		System.out.println(squareNumber.apply(5));
		
		
		Function<Double,Double> logNum= nu::logNum;
		System.out.println(logNum.apply(6.5));
		
		int arr[]= {45,23,12,80,67};
		Consumer<int[]> printMR=nu::printNum;
		printMR.accept(arr);
	}

}

class Hello{
	public String sayHello() {
		return "hello...";
	}
}

class NumberUtilMR{
	public int squareNumber(int num) {
		return num* num;
	}
	
	public double logNum(double num) {
		return Math.log(num);
	}
	
	public boolean isEven(int num) {
		return num%2==0; 
	}
	
	public void printNum(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+" ");
		}
	}
}