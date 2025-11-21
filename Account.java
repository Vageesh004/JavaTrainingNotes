package com.nov21.Day1MavenProject;

public class Account {
	private long accNo;
	private String accHolderName;
	private String bankName;
	private String ifsc;
	private String branchName;
	private int pin;
	
	public Account(long accNo, String accHolderName, String bankName, String ifsc, String branchName, int pin) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.branchName = branchName;
		this.pin = pin;
	}

	public Account() {
		super();
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bankName=" + bankName + ", ifsc="
				+ ifsc + ", branchName=" + branchName + ", pin=" + pin + "]";
	}
	
	
	public void withDraw(double amount) {
		System.out.println("Account withdraw");
	}
	
	public void deposit(double amount) {
		System.out.println("Account deposit");
	}
	
}
