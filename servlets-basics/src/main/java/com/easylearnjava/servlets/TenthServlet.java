package com.easylearnjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//request dispatcher sending a redirect to the current class
public class TenthServlet extends HttpServlet {

	/**
	 *Auto generated 
	 */
	private static final long serialVersionUID = -843513263548498623L;
	private static Logger log = Logger.getLogger(TenthServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		log.debug("In tenth servlet...");
		PrintWriter out = resp.getWriter();
		log.debug("Hi, The request is redirected to tenth servlet...");
		out.print("Hi, The request is redirected to tenth servlet...");
		
	}
	
	
	
}
