package com.nov22.Day6_MavenProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//import java.sql.Date;

import java.util.Date;

public class ConvertDate {
	public static void main(String[] args) throws ParseException {
		/*Date date=new Date(2025-1900,10,24);
		
		System.out.println(date);
		System.out.println(new java.util.Date());
		
		java.util.Date utilDate=new java.util.Date();*/
		
		Date today=new Date();
		java.sql.Date sqlDate=new java.sql.Date(today.getTime());
		
		System.out.println(today);
		System.out.println(sqlDate);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String formatedDate=sdf.format(today);
		
		sqlDate=java.sql.Date.valueOf(formatedDate);
		System.out.println(sqlDate);		
			
		String strDate="15-08-2025";
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate= sdf.parse(strDate);
		java.sql.Date sdate= new java.sql.Date(uDate.getTime());
		
		
		//convert sql date to util date using valueof
		java.sql.Date sqlDate1= java.sql.Date.valueOf("2025-10-24");
		java.util.Date utilDate1=new java.util.Date(sqlDate1.getTime());
		java.util.Date utilDate2=sqlDate1; //sql date extends util,date,upcasting
		
		
		//using simpleDateFormat to convert util to sql
		java.sql.Date sqlDate2=java.sql.Date.valueOf("2025-03-25");
		String str=sqlDate2.toString();
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.parseObject(str));
		
		//convert string to sql date then to util date
		String myDate="2023-06-26";
		sqlDate1=java.sql.Date.valueOf(myDate);
		utilDate1=new java.util.Date(sqlDate1.getTime());
		System.out.println(utilDate1);
	}
}
