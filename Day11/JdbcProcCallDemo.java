package com.nov27_jdbc.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JdbcProcCallDemo {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String uname="root";
    	String pwd="root@39";
    	String url="jdbc:mysql://localhost:3306/vageesh";
    	
    	Connection con=DriverManager.getConnection(url,uname,pwd);
    	
    	CallableStatement cs=con.prepareCall("{call getGrade(?)}");
    	cs.setInt(1, 75);
    	
    	
    	ResultSet rs=cs.executeQuery();
    	
    	while(rs.next()) {
    		String res=rs.getString("grade");
    		System.out.println(res);
    	}
    	
    	
    	
    	/*ResultSetMetaData rsmd=rs.getMetaData();
    	int columnsCount= rsmd.getColumnCount();
    	while(rs.next()) {
    		for(int i=1;i<=columnsCount;i++) {
    			System.out.println(rsmd.getColumnName(i) + ":" + )
    		}
    	}*/
	}

}
