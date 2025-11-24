package com.nov22.Day6_MavenProject;

import java.util.*;
import java.lang.*;

public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff=new StringBuffer();
		
		buff.append("Dhoni");
		buff.append("Kohli");
		buff.append("Rohit");
		buff.append("Jaddu");
		
		System.out.println(buff);
		System.out.println(buff.capacity());
		
		StringBuffer sbf=new StringBuffer("name");
		System.out.println(sbf.capacity());
		sbf.ensureCapacity(15); //just ensures the capacity..if less,does nothing
		//else it increases to that capacity
		
		System.out.println(buff.capacity());
		sbf.ensureCapacity(30);

		sbf.ensureCapacity(sbf.capacity());
		
		
		StringBuilder sbl= new StringBuilder("Swapna Motupally");
		sbl.replace(7, 13, "*");
		System.out.println(sbl);
		
		System.out.println(sbl.reverse());
		
		
		String str="apple,banana,orange,pineapple";
		StringTokenizer tokenizer=new StringTokenizer(str,",");
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("Smith");
		sj.add("Starc");
		sj.add("Cummins");
		sj.add("Head");
		System.out.println(sj);
	}

}
