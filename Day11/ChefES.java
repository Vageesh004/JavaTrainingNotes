package com.nov27_thread.Day11_Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefES extends Thread{
	private String order;
	
	public ChefES(String order) {
		this.order=order;
	}
	
	@Override
	public void run() {
		
		
			System.out.println(getName()+ " is preparing " + order);
			
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				System.out.println(getName()+ "got interrupted");
			}
			
			System.out.println(getName() + " served " + order);
		}
		
	
	
	
	public static void main(String[] args) {
		ExecutorService manager=Executors.newFixedThreadPool(4);
		
		String[] menu= {"biryani","chicken 65","fish curry","paneer fry","fried rice"};
		
		for(String item: menu) {
			ChefES chefThread=new ChefES(item);
			
			manager.submit(chefThread); //we are submitting the work to the thread
			//we have created here
			
			
		}
		manager.shutdown();
	}

}
