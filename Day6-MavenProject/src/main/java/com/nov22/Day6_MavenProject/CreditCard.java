package com.nov22.Day6_MavenProject;

public class CreditCard {
	
	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount)) {
			System.out.println("Amount paid"+ amount+ "using credit card");
			generateReceipt(amount);
		}
		
		else {
			System.out.println("payment failed, Invalid amount")
		}
	}

}
