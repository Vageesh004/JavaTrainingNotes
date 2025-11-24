package com.mphasis;



class SampleClass{
	public static void main(String args[]){
		System.out.println(" Java Training");
		
		int i=0;short s=0; long l=0; float fl=0.0f; double d=0.0; byte b=0; boolean bl=false;
		char ch='a';
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(fl);
		System.out.println(d);
		System.out.println(b);
		System.out.println(bl);
		System.out.println(ch);
		
		Integer i1= i; //automatic conversion
		i=i1.intValue();

		
		b = 10;
		Byte B1 = Byte.valueOf(b);  // preferred
		Byte B2 = b;                // autoboxing
		
	
		Byte B = 10;                // autoboxing from literal
		byte b1 = B.byteValue();    // explicit
		byte b2 = B;                // unboxing

		
		

		/*short s = 20;
		Short S1 = Short.valueOf(s);
		Short S2 = s;               // autoboxing
		
		// Unboxing
		Short S = 20;
		short s1 = S.shortValue();
		short s2 = S;               // unboxing*/
		
		
		int a=57, r=2;
		System.out.println(a+r);
		System.out.println(a-r);
		System.out.println(a*r);
		System.out.println((float) a /r);
		System.out.println(a%b);
				
			
		++a;
		int k=++a;   //pre increment and post increment
		int c=a++;
		
		System.out.println(a);
		
		int t=5,j=4;
		System.out.println(t&j); //and operation
		System.out.println(t|j); //or operation
		System.out.println(t^j); //xor operation in bitwise
		
		System.out.println(t<<1);
		System.out.println(t>>1);
		
		int a1=5,bb=6,c1=7;
		
		System.out.println(a1>bb?(a1>c1 ? a1 : c1):(bb>c1 ? bb: c1));
		
		String name= "swapna"; //instance variable
		static String collegename="abc college" ; //class variable or static variable
		
		// for instance variable , there is copy available for each copy..object variables,instance variables, non-static variables...same 
		//for class variable, only one set of space fully throughout the program
		
		//Objects are stored in heap
		//Stack stores the local variables
		
		// the two storage area types are stack and heap
		
		
		
		
		
	} 
	}