package com.nov27.Day11_maven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoOnIOStream {
	
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		/*BufferedReader reader=new BufferedReader(new FileReader("assets/data.txt"));
		String data;
		
		while((data=reader.readLine())!=null)
			System.out.println(data);
		
		
		BufferedWriter writer=new BufferedWriter(new FileWriter("assets/data.txt"));
		writer.write("This is buffered writer");
		
		writer.newLine();
		writer.append("some more data");
		writer.close();
		
		
		
		//ByteStream Example
		//while((data=reader.readerLine()!=null)
		
		FileOutputStream fos= new FileOutputStream("assets/info.txt");
		String text="Vageesh";
		fos.write(text.getBytes());
		fos.close();
		
		/* Method 1 to read the file data*/
		/*FileInputStream fis=new FileInputStream("assets/info.txt");
		int b;
		
		while((b=fis.read())!=-1)
			System.out.print((char) b);
		
		fis.close();
		
		/* Approach 2*/
		/*byte arr[]=new byte[(int) new File("assets/info.txt").length()];
		fis.read(arr);
		fis.close();
		
		System.out.println(new String(arr));*/ //error is coming here
		
		
		//Object Stream Example
		
		/*Bottle bo=new Bottle(1,"Cello",700,"blue");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("assets/bottleInfo.txt"));
		
		oos.writeObject(b);
		oos.close(); */
		
		
		//Object 
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("assets/bottleInfo.txt"));
		
		Bottle b1=(Bottle)ois.readObject();
		ois.close();
		System.out.println(b1);
		
		
	}

}
