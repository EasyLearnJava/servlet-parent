package com.easylearnjava.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class STReadURL extends HttpServlet{

	/**
	 *Auto generated 
	 */
	private static final long serialVersionUID = -271061438813348380L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
          
        //getting value from the query string  
        String n=req.getParameter("uname");  
        out.print("Hello "+n);  
  
        out.close();  
	}
	
}
