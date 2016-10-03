package com.tms.techinvestor.base;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub

		System.out.println("Listener");
		ServletContext ctx = sce.getServletContext();

		String classFolder = ctx.getRealPath("/") + "WEB-INF"
				+ System.getProperty("file.separator") + "classes"
				+ System.getProperty("file.separator");

		System.out.println(classFolder);
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
