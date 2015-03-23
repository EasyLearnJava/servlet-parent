package com.easylearnjava.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//Shows how to create a cookie
public class STCreateCookie extends HttpServlet {

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = -411521637556171226L;
	private static Logger log = Logger.getLogger(STCreateCookie.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		log.debug("Entered doGet method..");
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();  
	          
	    String n= req.getParameter("userName");  
	    out.print("Welcome " + n);  
	  
	    Cookie ck=new Cookie("uname",n);//creating cookie object  
	    resp.addCookie(ck);//adding cookie in the response  
	  
	    //creating submit button  
	    out.print("<form action='STReadCookie'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
	          
	    out.close();  
	}
	
}
