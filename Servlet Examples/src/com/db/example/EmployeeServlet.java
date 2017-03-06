package com.db.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet{
		private Connection con=null;
		private Statement st=null;
		private ResultSet rs=null;
		List<Employee> obj;
		@Override
		public void init() throws ServletException {
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","NAVEEN","NAVEEN");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			obj=new ArrayList<Employee>();
			try{
				st=con.createStatement();
				rs=st.executeQuery("select empno,ename,job from emp");
				
				while(rs.next()){
					int empno=rs.getInt("empno");
					String name=rs.getString("ename");
					String job=rs.getString("job");
					Employee e=new Employee();
					e.setEmpno(empno);
					e.setEname(name);
					e.setJob(job);
					obj.add(e);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.print("<html>");
			out.print("<head><title>Display Date</title></head>");
			out.print("<body>");
			String email=(String) req.getAttribute("email");
			out.print("<h3> Hi! your mail id is :"+email+"</h3>");
			if(obj.size()>0){
				out.print("<table border=\"2\">");
				out.print("<tr><th>Empno</th><th>Name</th><th>Job</th></tr>");
			for(Employee e:obj)
				out.print("<tr><td>"+e.getEmpno()+"</td><td>"+e.getEname()+"</td><td>"+e.getJob()+"</td></tr>");
			out.print("</table>");		
			}else
				out.print("Sorry no No Employee is found");
			
			out.print("<a href=\"index.html\">home</a>");
			out.print("</body>");
			out.print("</html>");
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				doGet(req, resp);
		}
}
