package com.easylearnjava.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//commonly used HTTP methods
public class SecondServlet extends HttpServlet{

	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = 1783032968101114239L;
	private static Logger log = Logger.getLogger(SecondServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("In servlet doGet method...");
		log.debug("In servlet doGet method...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("In servlet doPost method...");
		log.debug("In servlet doPost method...");
	}
}
