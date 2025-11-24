package com.nov22.Day6_MavenProject;

public class Person {
	
	private String name;
	private int id;
	private int age;
	
	
	
	public void checkEligibility() throws AgeNotSufficientException {
		if(this.age < 18) {
			System.out.println("person is eligible to cast vote");
		}
		
		else
			throw new AgeNotSufficientException("person age less than 18");
	}

}
