package com.easylearnjava.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class EleventhServlet extends HttpServlet{

	/**
	 *Auto generated 
	 */
	private static final long serialVersionUID = 4140769682149727531L;
	private static Logger log = Logger.getLogger(EleventhServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		log.debug("Sending a redirect to another link...");
		resp.sendRedirect("www.easylearnjava.com");
	}
	

}
