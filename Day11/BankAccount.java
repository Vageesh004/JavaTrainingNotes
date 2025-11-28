package com.nov27_thread.Day11_Threads;

public class BankAccount {
	private double balance=15000;
	
	public static void main(String[] args) {
		BankAccount account=new BankAccount();
		
		Runnable r=()->{
			account.withDraw(1000);
			
		};
		Thread t1=new Thread(r,"user1");
		Thread t2=new Thread(r,"user2");
		
		t1.start();
		t2.start();
		
	}

	/*private synchronized void withDraw(double amount) {
		if(amount>balance)
			System.out.println("insufficient funds");
		else {
			System.out.println(Thread.currentThread().getName() + " withdrawing");
			balance-=amount;
			System.out.println("Remaining balance:" + balance);
		}
			
	}*/
	
	public void withDraw(double amount) {
		
		System.out.println(Thread.currentThread().getName() + "is running");
		
		synchronized(this) {
			if(amount>balance)
				System.out.println("insufficient funds");
			else {
				System.out.println(Thread.currentThread().getName() + " withdrawing");
				balance-=amount;
				System.out.println("Remaining balance:" + balance);
			}
		}
		
	}
		

}
