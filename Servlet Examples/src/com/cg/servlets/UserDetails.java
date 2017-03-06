package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class UserDetails extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String gendar=req.getParameter("sex");
			String vechile[]=req.getParameterValues("vehicle");
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.print("<html>");
			out.print("<head><title>Display Date</title></head>");
			out.print("<body>");
			out.print("<table>");
			out.print("<tr><th>Name</th><th>Value</th>");
			out.print("<tr><td>Uname</td><td>"+name+"</td></tr>");
			out.print("<tr><td>Email</td><td>"+email+"</td></tr>");
			out.print("<tr><td>Password</td><td>"+password+"</td></tr>");
			out.print("<tr><td>Gendar</td><td>"+gendar+"</td></tr>");
			out.print("<tr><td>Vechiles</td><td>");
			for(String vec:vechile)
				out.print(vec);
			out.print("</td></tr>");
			out.print("</table>");
			out.print("<h3>Please confirm your details</h3>");
			out.print("</body>");
			out.print("</html>");
			
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				doGet(req, resp);
		}
}
