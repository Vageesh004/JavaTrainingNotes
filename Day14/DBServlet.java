package com.dec2;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletConfig;

/**
 * Servlet implementation class DBServlet
 */
//@WebServlet("/DBServlet")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DBServlet() {
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletConfig config=getServletConfig();
		PrintWriter out=response.getWriter();
		
		String url=config.getInitParameter("url");
		String uname=config.getInitParameter("uname");
		String pwd=config.getInitParameter("pwd");
		out.println("URL:" + url);
		out.println("Username:" + uname);
		out.println("Password:" + pwd);
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
