package com.nov22.Day6_MavenProject;

public class Main {
	public static void main(String[] args) {
		CreditCard cc=new CreditCard();
		cc.pay(3500);
		
		Upi upi=new Upi();
		upi.pay(50);
		
		Payment payment=new CreditCard();
		payment.pay(8000);
		
		Payment payment1=new Upi();
		payment1.pay(8000);
	}

}
