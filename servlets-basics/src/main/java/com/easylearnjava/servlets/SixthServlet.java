package com.easylearnjava.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//Servlets are not thread safe
public class SixthServlet extends HttpServlet{

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = -6609557393542063969L;
	private static Logger log = Logger.getLogger(SixthServlet.class);
	
	public int count = 5;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.debug("The value of count is : " + count);
	}
	
	
	

}
