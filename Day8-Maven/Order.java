package com.nov25.Day8_maven;

public class Order<T> {

	private T item;

	public Order(T item) {
		super();
		this.item = item;
	}

	public Order() {
		super();
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Order [item=" + item + "]";
	}
	
	
	
	
	
	

}
