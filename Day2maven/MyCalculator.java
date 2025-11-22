package com.nov22.Day6_MavenProject;

public class MyCalculator{
	
	/*@Override
	public int add(int a,int b) {
		return a+b;
	}*/
	
	

	public static void main(String[] args){
		//Calculator mc=(int a,int b) -> a+b;*/
		
	// we have reduced line of code using lambda
			
	
	//For Subtraction
	
	//Calculator c=(int a,int b)-> System.out.println(a-b);
	
	//c.sub(78,32);
		
		
	//System.out.println(mc.add(5, 6);
	
	/*Calculator c=()->{
		int a=89,b=4;
		System.out.println(a*b);
	};
	
	c.mul();*/
	
	Calculator c=()->{
		int a=5,b=2;
		return ((float) a/b);
	};
	
	System.out.println(c.div());
}
}
