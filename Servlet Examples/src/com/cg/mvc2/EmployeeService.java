package com.cg.mvc2;

import java.util.List;

public class EmployeeService {
		private EmployeeDao dao=new EmployeeDao();

		public List<Employee> getEmployees() {
			
			return dao.getEmployees();
		}
}
