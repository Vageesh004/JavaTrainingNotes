package com.nov22.Day6_MavenProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//string in the format yyyy-MM-dd hh:mm:sec a
		//given timeDate is 2024-11-22 15:45:40 a
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime lt=LocalDateTime.of(2024, 11,22,15,45,40);
		String str=df.format(lt);
		System.out.println(str);
		
		
		String str1="2024-11-23 15:45:40";
		LocalDateTime parsedDateTime= LocalDateTime.parse(str1)
	}
}
