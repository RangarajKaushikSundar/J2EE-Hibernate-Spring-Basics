package com.cg.mvc2;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class EmployeeController extends HttpServlet {
		private EmployeeService service=new EmployeeService();
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			String uri=req.getRequestURI();
			if(uri.endsWith("viewEmployees.do")){
			List<Employee> list=service.getEmployees();
			System.out.println(list);
			req.setAttribute("list", list);
			RequestDispatcher rd=req.getRequestDispatcher("viewEmployee.jsp");
			rd.forward(req, resp);
			}else if(uri.endsWith("addEmployee.do")){
				RequestDispatcher rd=req.getRequestDispatcher("addEmployee.jsp");
				rd.forward(req, resp);
			}else if(uri.endsWith("store.do")){
				
			}
		}
}
