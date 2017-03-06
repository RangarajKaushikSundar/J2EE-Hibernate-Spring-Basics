package com.cg.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			/*RequestDispatcher rd=null;
			String email=req.getParameter("email");
			
			String password=req.getParameter("password");
			ServletConfig config=getServletConfig();
			String mail=config.getInitParameter("email");
			String pwd=config.getInitParameter("pwd");
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.print("<html>");
			out.print("<head><title>Display Date</title></head>");
			out.print("<body>");
			if(email.equals(mail) && password.equals(pwd)){
				rd=req.getRequestDispatcher("/empInfo");
				req.setAttribute("email", email);
				rd.forward(req,resp);
			}else{
				out.print("<font color=\"red\"><h3>Sorry Uname or password wrong</h3></font>");
				rd=req.getRequestDispatcher("index.html");
				rd.include(req, resp);
			}*/
			
			resp.sendRedirect("http://www.facebook.com");
		}
}
