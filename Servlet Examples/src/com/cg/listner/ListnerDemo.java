package com.cg.listner;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListnerDemo implements ServletContextListener{
	ServletContext context;
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context initilized");
		context=sce.getServletContext();
		Map<String, String> user=new HashMap<String, String>();
		user.put("Miani", "Admin");
		user.put("Rajesh", "Manager");
		context.setAttribute("users", user);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}

}
