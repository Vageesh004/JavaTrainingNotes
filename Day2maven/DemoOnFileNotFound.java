package com.nov22.Day6_MavenProject;

import java.io.File;
import java.io.FileNotFoundException;

public class DemoOnFileNotFound {
	
	public static void useFile(File f) throws FileNotFoundException {
		
		if(!f.exists()) {
			throw new FileNotFoundException();
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("demo.txt");
		
		useFile(f);
	}

}
