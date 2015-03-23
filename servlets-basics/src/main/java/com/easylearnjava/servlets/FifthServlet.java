package com.easylearnjava.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

public class FifthServlet extends HttpServlet{

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = 8148451032140228611L;
	private static Logger log = Logger.getLogger(FifthServlet.class);
	
	@Override
	public void init() throws ServletException {
		System.out.println("In init method...");
		log.debug("In init method...");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("In service method...");
		log.debug("In service method...");
		
		FifthServlet fs = new FifthServlet();
		fs.init();
		fs.destroy();		
	}
	
	@Override
	public void destroy() {
		System.out.println("In destroy method...");
		log.debug("In destroy method...");
	}

	
	
	

}
