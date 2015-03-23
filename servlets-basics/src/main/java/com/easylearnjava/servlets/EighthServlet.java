package com.easylearnjava.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//retrieving the servlet context and servlet config parameter values
public class EighthServlet extends HttpServlet{

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = 3548961974917119025L;
	private static Logger log = Logger.getLogger(EighthServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		log.debug("Servlet Context : " + getServletContext().getInitParameter("instructor"));
		log.debug("Servlet Config : " + getServletConfig().getInitParameter("tutorials"));
	}
	
}
