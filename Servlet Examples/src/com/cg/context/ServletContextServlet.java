package com.cg.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			try{
				ServletContext context=getServletContext();
				String user=context.getInitParameter("user");
				String password=context.getInitParameter("password");
				String driver=context.getInitParameter("driver");
				String url=context.getInitParameter("url");
				Class.forName(driver);
				Connection con=DriverManager.getConnection(url,user,password);
				PreparedStatement pst=con.prepareStatement("insert into member values(?,?,?)");
				int mid=Integer.parseInt(req.getParameter("mid"));
				String name=req.getParameter("name");
				String email=req.getParameter("email");
				pst.setInt(1, mid);
				pst.setString(2, name);
				pst.setString(3, email);
				pst.executeUpdate();
				resp.setContentType("text/html");
				PrintWriter out=resp.getWriter();
				out.print("<html>");
				out.print("<head><title>Display Date</title></head>");
				out.print("<body>");
				out.print("user is inserted");
				out.print("</body>");
				out.print("</html>");
				resp.sendRedirect("member.html");
				
				}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
