package com.nov22.Day6_MavenProject;

public class DemoOnThrow {
	
	public static void checkMethod(int a,int b[]) {
		
		for(int i=0;i<b.length;i++) {
			if(b[i]==0)
				throw new ArithmeticException();
			else if(i>=b.length)
				throw new ArrayIndexOutOfBoundsException();
			
			else
				System.out.println(a/b[i]);
		}
	}
	
	public static void main(String args[]) {
		int a=51,b[]= {2,3,4,5};
		
		checkMethod(a,b);
	}

}
