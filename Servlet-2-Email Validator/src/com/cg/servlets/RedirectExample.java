package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectExample extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		RequestDispatcher rd=null;
		response.setContentType("text/html");
		String email=request.getParameter("email");
	
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<title>HelloWorld</title>");
		out.print("<body>");
		if(email.equalsIgnoreCase("kaushik@gmail.com"))
			response.sendRedirect("https://login.secureserver.net/?app=wbe username="+email);
		else{
			rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			out.print("<font color=\"red\"><b><p>Login Failed</p></b></font>");
		}

		out.print("</body></html>");
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}
}
