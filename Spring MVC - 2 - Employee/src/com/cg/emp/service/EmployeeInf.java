package com.cg.emp.service;

import java.util.List;

import com.cg.emp.vo.Employee;

public interface EmployeeInf {
		public int storeEmployee(Employee emp);
		public Employee getEmployee(int empno);
		public List<Employee> getEmpList();
}
