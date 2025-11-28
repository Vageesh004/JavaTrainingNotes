package com.nov27_jdbc.Jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	// go to the maven repositories, search mysql connector..then select mysql connector j
    	// then click 8.0.33
    	//then copy and paste in pom.xml dependencies
    	
    	
    	
    	// on your project, right click, maven => update project.. 99 per cent jars 
    	//will updated... do update after clean and install
    	System.out.println("Driver loaded");
    	
    	
    	String uname="root";
    	String pwd="root@39";
    	
    	/*String url="jdbc:mysql://localhost:3306/vageesh";
    	Connection con=DriverManager.getConnection(url,uname,pwd);
    	
    	System.out.println("Connection established");
    	
    	String query="select * from employee";
    	Statement st= con.createStatement();
    	//st.executeQuery(query);
    	
    	ResultSet rs=st.executeQuery(query);
    	
    	while(rs.next()) {
    		System.out.println("Employee Id:" + rs.getInt(1));
    		System.out.println("Employee Name:" + rs.getString(2));
    		//System.out.println("Employee Mobile:" + rs.getString(3));
    		System.out.println("Employee joining date:" + rs.getString(5));
    		System.out.println("Employee Salary:" + rs.getDouble(3));
    		System.out.println("Employee DId:" + rs.getInt(4));
    		//System.out.println("Employee Mail:" + rs.getString(7));
    	}*/
    	
    	//Method 2: using try with resources
    	String url="jdbc:mysql://localhost:3306/vageesh";
    	
    	try(Connection con=DriverManager.getConnection(url,uname,pwd);
    		Statement st= con.createStatement();
    		ResultSet rs=st.executeQuery("select * from employee");){
    		
    		ResultSetMetaData rsmd=rs.getMetaData();
    		int columnsCount=rsmd.getColumnCount();
    		
    		for(int i=1;i<=columnsCount;i++) {
    			System.out.println(rsmd.getColumnName(i) + " "+ rsmd.getColumnClassName(i));
    		}
    	
    	//System.out.println("Connection established");
    	
    	// String query="select * from employee";
    	//Statement st= con.createStatement();
    	//st.executeQuery(query);
    	
    	//ResultSet rs=st.executeQuery(query);
    	
    	while(rs.next()) {
    		/*System.out.println("Employee Id:" + rs.getInt(1));
    		System.out.println("Employee Name:" + rs.getString(2));
    		
    		System.out.println("Employee joining date:" + rs.getString(5));
    		System.out.println("Employee Salary:" + rs.getDouble(3));
    		System.out.println("Employee DId:" + rs.getInt(4));*/
    		
    		for(int i=1;i<=columnsCount;i++)
    			System.out.println(rsmd.getColumnName(i) + " "+rs.getString(rsmd.getColumnName(i)));
    		System.out.println("------------");
    		
    	}
    	
    	 DatabaseMetaData dbmd=con.getMetaData();
    	 System.out.println(dbmd.getDatabaseProductName());
    	 ResultSet rs1=dbmd.getTables("vageesh", null,"%", new String[] {"TABLE"});
    	 
    	 while(rs1.next()) {
    		 System.out.println(rs1.getString("TABLE_NAME"));
    	 }
    	 
    	 
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	/*
    	rs.close();
    	st.close();
    	con.close();*/
    	
    	//we want to manually close all the resources.. For this, we can use TryWithResources 
    	//with AutoCloseable also
    	
  }
}
