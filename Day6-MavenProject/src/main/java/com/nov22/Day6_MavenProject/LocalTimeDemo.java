package com.nov22.Day6_MavenProject;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time=LocalTime.now();
		System.out.println(time); //1
		
		LocalTime t1=LocalTime.of(9, 30);
		System.out.println(t1); //2
		
		//generally it prints in the 24 hrs format
		
		LocalTime t2=LocalTime.of(22,30);
		System.out.println(t2);  //3
		
		System.out.println(time.getHour()); //4
		System.out.println(time.getMinute()); //5
		System.out.println(time.getSecond()); //6
		
		
		//use isBefore isAfter
		//code for comparing two localtime
		
		//converting string to localtime
		String strTime="11:35:20";
		LocalTime convertedTime=LocalTime.parse(strTime);
		System.out.println(convertedTime); //7
		
		
		//converting to specific format
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formattedTime=time.format(df);
		System.out.println(formattedTime); //8
		
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
	}

}
