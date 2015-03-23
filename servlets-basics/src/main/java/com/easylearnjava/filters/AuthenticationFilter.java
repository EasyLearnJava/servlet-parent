package com.easylearnjava.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

public class AuthenticationFilter implements Filter{
	
	private static Logger log = Logger.getLogger(AuthenticationFilter.class);

	public void init(FilterConfig filterConfig) throws ServletException {
		log.debug("In init method in a AuthenticationFilter class...");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		log.debug("In doFilter method in a AuthenticationFilter class...");
		
		//Once the doFilter is done, to call the consecutive servlets if any, use the doFilter method
		chain.doFilter(request, response);
	}

	public void destroy() {
		log.debug("In destroy method in a AuthenticationFilter class...");
	}

}
