package com.nov27_thread.Day11_Threads;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("thread" + this.getName() + "running");
		
		for(int i=1;i<=5;i++) {
			System.out.println(this.getName() + "value :" + i);
		}
		
		try {
			Thread.sleep(1000);  //after 1000ms of prev thread's execution only,next thread runs
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		t1.start();
		t2.start();
	}

}
