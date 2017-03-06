package com.cg.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.emp.dao.EmployeeDao;
import com.cg.emp.vo.Employee;
@Service
public class EmployeeService implements EmployeeInf {
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public int storeEmployee(Employee emp) {
		
		return 0;
	}

	@Override
	public Employee getEmployee(int empno) {
		
		return null;
	}

	@Override
	public List<Employee> getEmpList() {
		
		return employeeDao.getEmpList();
	}

}
