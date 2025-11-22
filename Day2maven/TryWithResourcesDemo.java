package com.nov22.Day6_MavenProject;

public class TryWithResourcesDemo implements AutoCloseable {

	@Override
	public void close() throws Exception{
		System.out.println("resource closed successfully");
	}
	
	/*public static void main(String[] args) {
		TryWithResourcesDemo demo= new TryWithResourcesDemo();
		try(demo){
			System.out.println("using demo resource");
		}
				
		
	}*/
}
