package com.cg.emp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.emp.vo.Employee;
@Repository
public class EmployeeDao {
		@Autowired
		private JdbcTemplate template;

		public List<Employee> getEmpList() {
		List<Employee> list=template.query("select * from emps",new BeanPropertyRowMapper(Employee.class));
			return list;
		}
}
