package com.easylearnjava.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class STCreateHiddenField extends HttpServlet{

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = -3068486616722073730L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
          
        String n=req.getParameter("userName");  
        out.print("Welcome "+n);  
          
        //creating form that have invisible textfield  
        out.print("<form action='readHiddenField'>");  
        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
        out.print("<input type='submit' value='go'>");  
        out.print("</form>");  
        out.close();  
	}
	
	

}
