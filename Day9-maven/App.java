package com.nov26.Day9_maven;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	System.out.println("Immutable class creation");
    	System.out.println("1. Class need to be final " +" 2.Properties need to be final"
    			+ " 3.Properties need to get value through constructor"
    			+ "4. no setters to modify the data");
    	
    	Person p1=new Person("Vageesh",123);
    	System.out.println("Hello World!");
    }
}
