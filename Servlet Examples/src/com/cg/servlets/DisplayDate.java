package com.cg.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class DisplayDate extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head><title>Display Date</title></head>");
		out.print("<body>");
		out.print("<h3> Today date is :"+new java.util.Date()+"</h3>");
	   Integer count=(Integer) getServletContext().getAttribute("count");
	   out.print("<h3> Count is :"+count+"</h3>");
		out.print("</body>");
		out.print("</html>");
		
		
	}

}
