package com.nov27_jdbc.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JdbcCRUDApp {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String uname="root";
    	String pwd="root@39";
    	String url="jdbc:mysql://localhost:3306/vageesh";
    	
    	try(Connection con=DriverManager.getConnection(url,uname,pwd);
        		Statement st= con.createStatement();
        		ResultSet rs=st.executeQuery("select * from employee");){
    		
    		//inserting record
    		
    		/*String query="insert into employee values(?,?,?,?,?)";
    		PreparedStatement ps=con.prepareStatement(query);
    		ps.setInt(1, 101); //column name we are giving in first paramater..string it is
    		//not accepting
    		//we cannot give get method, set method-- i.e getters setters for the database.
    		//so, 
    		
    		ps.setString(2,"amit");
    		ps.setDouble(3,45000);
    		ps.setInt(4,1);
    		ps.setString(5,"2025-11-14"); //for date,even if we have given date type,string is working
    		
    		ps.executeUpdate();
    		System.out.println("Row inserted successfully");*/
    		
    		//read records
    		/*ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
    		int columnsCount= rsmd.getColumnCount();
    		
    		for(int i=1;i<=columnsCount;i++)
    			System.out.println(rsmd.getColumnName(i)+ " "+ rsmd.getColumnClassName(i));*/
    		
    		
    		
    		//update record
    		
    		String query="update employee set salary=? where id=? ";
    		PreparedStatement ps=con.prepareStatement(query);
    		ps.setDouble(1,60000);
    		ps.setInt(2, 101);
    		ps.executeUpdate();
    		
    		//we should give 1 for first question mark..in get() fxn from database only,
    		//we check the column order number.. so, 
    		//delete record
    		
    		
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}

}
