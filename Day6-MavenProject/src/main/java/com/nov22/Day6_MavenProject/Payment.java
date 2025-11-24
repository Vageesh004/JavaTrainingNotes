package com.nov22.Day6_MavenProject;

public interface Payment {
	public void pay(double amount);
	
	public default void generateReceipt() {
		System.out.println("Receipt generated successfully for the amount: "+ amount);
		

	}
	
	public static boolean validateAmount(double amount) {
		return amount>0;
	}

}
