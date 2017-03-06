package com.cg.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ColorsList extends HttpServlet {
	ArrayList<String> list;
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
				resp.setContentType("text/html");
				PrintWriter out=resp.getWriter();
				String color=req.getParameter("color");
				HttpSession session=req.getSession();
				session.setMaxInactiveInterval(40);
				String uri=req.getRequestURI();
				StringBuffer url=req.getRequestURL();
				System.out.println(uri);
				System.out.println(url);
				
				if(uri.endsWith("logout")){
					
					if(session!=null){
						session.invalidate();
						resp.sendRedirect("colors.html");
					}
				}else{
				if(color==null)
					color="Violet";
				out.print("<html>");
				out.print("<head>");
				out.print("<title>Colors list</title>");
				out.print("</head>");
				out.print("<body bgcolor="+color+">");
				if(session.isNew()){
					list=new ArrayList<String>();
					list.add(color);
					session.setAttribute("list", list);
					out.print("<h3> THIS IS NEW SESSION</h3>");
					
				}else{
					list=(ArrayList<String>) session.getAttribute("list");
					list.add(" "+color +" ");
					out.print("<h3> THIS IS OLD SESSION</h3>");
				}
				displayColor(session,out);
				out.print("<a href=\"colors.html\">home</a>");
				out.print("<form action=\"logout\">");
				out.print("<input type=\"submit\" value=\"logout\">");
				out.print("</form>");
				
				out.print("</body>");
				out.print("</html>");
				}
				
		}
	private void displayColor(HttpSession session, PrintWriter out) {
		List<String> list=(List<String>) session.getAttribute("list");
		if(list.size()==0){
			out.print("No colors selected");
		}else{
			out.print("{");
			for(String name:list){
				out.print( name );
			}
			out.print("}");
		}
		
	}
}
