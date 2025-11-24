package com.nov22.Day6_MavenProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoOnDatesAndTime {
	public static void main(String[] args) throws ParseException {
		
		Date currentDate= new Date();
		System.out.println(currentDate); //1
		
		long ms=System.currentTimeMillis();
		System.out.println(ms);//2
		
		Date currentDateOfMS=new Date(ms);
		System.out.println(currentDateOfMS); //3
		
		long msl=1234567890123l;
		
		Date myDate=new Date(msl);
		System.out.println(myDate); //4
		
		
		Date newDate=new Date(2024-1900,07,22);
		System.out.println(newDate); //5
		
		System.out.println(currentDate); //6
		
		System.out.println(currentDate.getDate()+3); //7
		System.out.println(currentDate.getDay()); // 8  //1 means Monday..0 means Sunday
		System.out.println(currentDate.getYear()); //9  //2025-1900=125
		
		
		Date date1=new Date(2025,01,24);
		Date date2=new Date(2023,01,24);
		System.out.println(date1.after(date2)); //10
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		System.out.println(sdf.format(currentDate)); //11
		
		String str="24-11-2025";
		
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		Date d=sdf1.parse(str);
		System.out.println(d); //12
		
		Date dob=new Date(2000-1900,05,20);
		Date today=new Date();
		
		int ageInYears=dob.getYear()-today.getYear(); //13
		System.out.println(ageInYears + "Years");
		
		System.out.println(today.toString());
		
		
	}
	
	

}
