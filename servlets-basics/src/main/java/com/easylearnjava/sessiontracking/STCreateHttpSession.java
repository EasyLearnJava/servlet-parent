package com.easylearnjava.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class STCreateHttpSession extends HttpServlet{

	/**
	 *Auto generated 
	 */
	private static final long serialVersionUID = -5534491881640230417L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
          
        String n=req.getParameter("userName");  
        out.print("Welcome "+n);  
          
        HttpSession session=req.getSession();  
        session.setAttribute("uname",n);  
  
        out.print("<a href='servlet2'>visit</a>");  
                  
        out.close();  
	}
	

}
