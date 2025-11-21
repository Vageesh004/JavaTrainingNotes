package com.nov21.Day1MavenProject;

public class SavingAccount extends Account {
	private double balance;

	public SavingAccount(long accNo, String accHolderName, String bankName, 
			String ifsc, String branchName, int pin,
			double balance) {
		super(accNo, accHolderName, bankName, ifsc, branchName, pin);
		this.balance = balance;
		
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", getBalance()=" + getBalance() + ", getAccNo()=" + getAccNo()
				+ ", getAccHolderName()=" + getAccHolderName() + ", getBankName()=" + getBankName() + ", getIfsc()="
				+ getIfsc() + ", getBranchName()=" + getBranchName() + ", getPin()=" + getPin() + "]";
	}

	
	public void withDraw(double amount) {
		if(amount< this.balance) {
			this.balance=this.balance-amount;
			System.out.println("withdraw successful");
		}
		
		else {
			System.err.println("insufficient funds");
		}
		
		
	}
	
	public void deposit(double amount) {
		this.balance= this.balance + amount;
	}
	
	public double checkBalance() {
		return getBalance();
	}
	//code for changePin and generatePin is homework

}
