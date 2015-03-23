package com.easylearnjava.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class STReadCookie extends HttpServlet{

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = 7362871649923360901L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");  
	    PrintWriter out = resp.getWriter();  
	      
	    Cookie ck[]=req.getCookies();  
	    out.print("Hello "+ck[0].getValue());  
	  
	    out.close();
	}
	
}
