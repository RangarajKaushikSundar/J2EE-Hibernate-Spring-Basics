package com.cg.listner;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDetails extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			ServletContext context=getServletContext();
			Map<String, String> user=(Map<String, String>) context.getAttribute("users");
		
			context.setAttribute("name","Miani");
			context.setAttribute("email","miani@gmail.com");
			context.setAttribute("name", "Rajesh");
			context.removeAttribute("email");
			System.out.println(user);
		
		}
}
