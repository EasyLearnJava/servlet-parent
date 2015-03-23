package com.easylearnjava.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//Request Dispatcher  
public class NinthServlet extends HttpServlet{

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = 4068506185320248547L;
	private static Logger log = Logger.getLogger(NinthServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		log.debug("Redirecting the request to a new location ");
		
		//myTenthServlet is the url-pattern of the new destination servlet
		RequestDispatcher rd = req.getRequestDispatcher("myTenthServlet");
		rd.forward(req, resp);
	}
	

}
