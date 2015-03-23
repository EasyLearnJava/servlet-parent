package com.easylearnjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
/*
 * Servlet Hierarchy & Constructor in a servlet
 */
public class ThirdServlet extends HttpServlet {

	/**
	 * Auto Generated
	 */
	private static final long serialVersionUID = 1962305748548859680L;
	private static Logger log = Logger.getLogger(ThirdServlet.class);

	//Servlet --> AbstractServlet --> HttpServlet --> user defined Servlet
	//The constructor will be called only once before the servlet is initialized by the webcontainer
	public ThirdServlet(){
		System.out.println("In ThirdServlet constructor...");
		log.debug("In ThirdServlet constructor...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("This is from the doGet Method...");
		
	}
	
	/*
	 * Technically you can define constructors in servlet. 
	 * But, the declared constructor cannot access the ServletConfig object
	 */
	
	
	/*
	 * Also, Java constructors cannot be declared in interfaces. 
	 * So, javax.servlet.Servlet interface cannot have a constructor that accepts a ServletConfig parameter. 
	 * To overcome this, init() method is used for initialization instead of declaring a constructor.
	 */
}
