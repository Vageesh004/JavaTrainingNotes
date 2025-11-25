package com.nov25.Day8_maven;

public class Pair<K,V> {
	
	private K key;
	private V value;
	

	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
	public Pair() {
		super();
	}


	//using constructor to set the value.
	//select getters alone to get the value

	public K getKey() {
		return key;
	}


	public V getValue() {
		return value;
	}


	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	
	
}
