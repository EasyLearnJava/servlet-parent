package com.easylearnjava.servlets;

import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

//can a servlet constructor be private ???
public class FourthServlet extends HttpServlet{

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = 5118066530249002009L;
	private static Logger log = Logger.getLogger(FourthServlet.class);

	//web container cannot invoke the servlet with private constructor
	private FourthServlet(){
		System.out.println("In servlet constructor...");
		log.debug("In servlet constructor...");
	}
	
}
