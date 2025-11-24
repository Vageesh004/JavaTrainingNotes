package com.nov22.Day6_MavenProject;

import java.util.function.Supplier;

public class DemoSupplier {
	public static void main(String[] args) {
		String name="Vageesh";
		
		Supplier<String> supplier=()->name.toUpperCase();
		
		System.out.println(supplier.get());
		
		Supplier<Integer> randomSupplier=()-> {
			return (int)Math.round(Math.random()*10000);
		};
		
		System.out.println(randomSupplier.get());
		
		int a=89,b=34;
		Supplier<Integer> maxSupplier=()->{
			return (a>b?a:b);
		};
		
		System.out.println(maxSupplier.get());
	}
}
