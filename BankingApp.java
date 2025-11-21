package com.nov21.Day1MavenProject;

public class BankingApp {
	
	public static void main(String args[]) {
		SavingAccount sa=new SavingAccount(34567821,"Vageesh","HDFC","HIDS00009",
				"Trichy",1234,10000);
		
		System.out.println(sa);
		
		sa.withDraw(5000);
		sa.deposit(20000);
		sa.withDraw(5000);
		System.out.println(sa.checkBalance());
		
		// Account acc=new Account();
		
	}
	
}
