package com.easylearnjava.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Session is created");
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Session is destroyed");
	}

}
