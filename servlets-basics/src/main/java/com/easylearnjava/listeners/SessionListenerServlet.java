package com.easylearnjava.listeners;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionListenerServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2795333202837431895L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		
		System.out.println("Adding attribute to Session...");
		req.getSession().setAttribute("user", "naveen");
		System.out.println("Adding attribute to Session completed!");
			
		System.out.println("Removing Session...");
		req.getSession().invalidate();
		System.out.println("Removing Session completed!");		
			
		out.println("Successfully adding and removing attributes from Session");
	}
	

}
