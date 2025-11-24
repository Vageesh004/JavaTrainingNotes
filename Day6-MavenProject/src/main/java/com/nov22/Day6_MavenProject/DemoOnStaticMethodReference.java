package com.nov22.Day6_MavenProject;

import java.util.function.Function;
import java.util.function.Predicate;

public class DemoOnStaticMethodReference {
	//classname:methodname
	//objname: method
	
	static class NumberUtil{
		public static int squareNum(int num) {
			return num* num;
		}
		
		public static double log(double num) {
			return Math.log(num);
		}
		
		public static boolean isEven(int num) {
			return num%2==0;
		}
	}
	
	/*static class StringUtil{
		public static int strLen(String )
	}*/
	

	public static void main(String[] args) { 
		Function<Integer, Integer> squareFunctionUsingLambda=(num)-> NumberUtil.squareNum(num);
		
		Function<Integer,Integer> squareFunctionMR = NumberUtil::squareNum;
		
		System.out.println(squareFunctionUsingLambda.apply(6));
		System.out.println(squareFunctionMR.apply(6));
		
		Function<Double,Double> logUsingMR= NumberUtil::log; //method Reference
		Function<Double,Double> logUsingLambda=(num)-> NumberUtil.log(num);
		
		System.out.println(logUsingLambda.apply(6.0));
		System.out.println(logUsingMR.apply(6.0));
		
		Predicate<Integer> isEvenUsingLambda=(num)-> NumberUtil.isEven(num);
		Predicate<Integer> isEvenUsingMR= NumberUtil::isEven;
		
		System.out.println(isEvenUsingLambda.test(6));
		System.out.println(isEvenUsingMR.test(6));
		
		/*String name="Vageesh";
		Function<String,Integer> strLenUsingLambda =(name1)-> StringUtil::strLen(name1);
		
		*/
		

	}
}
