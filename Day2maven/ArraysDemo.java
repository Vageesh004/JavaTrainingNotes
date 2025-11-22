package com.nov22.Day6_MavenProject;

public class ArraysDemo {
	public static void main(String args[]) {
		
		Fruits fruitsArr[]= new Fruits[5];
		Fruits fruit1=new Fruits("apple","red",35.50);
		Fruits fruit2=new Fruits("mango","yellow",80.90);
		Fruits fruit3=new Fruits("orange","orange",10);
		
		Fruits fruit4=new Fruits("watermelon","green",80);
		Fruits fruit5=new Fruits("banana","yellow",10);
		
		fruitsArr[0]=fruit1;
		fruitsArr[1]=fruit2;
		fruitsArr[2]=fruit3;
		fruitsArr[3]=fruit4;
		fruitsArr[4]=fruit5;
		
		for(int i=0;i<fruitsArr.length;i++) {
			System.out.println("Cost per dozen for "+ fruitsArr[i].getFruitName()
					+ "is " + fruitsArr[i].calculateCostPerDozen());
		}
	}

	
}
