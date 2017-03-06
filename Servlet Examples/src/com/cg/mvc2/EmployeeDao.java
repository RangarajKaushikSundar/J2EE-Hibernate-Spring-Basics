package com.cg.mvc2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
		private EmployeeDaoUtil util=new EmployeeDaoUtil();
		private Connection con=null;
		private Statement st=null;
		private ResultSet rs=null;
		public List<Employee> getEmployees(){
			List<Employee> list=new ArrayList<Employee>();
			try{
			con=util.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select empno,ename,job from emp");
			while(rs.next()){
				Employee emp=new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				list.add(emp);
			}
			
			}catch (Exception e) {
				System.out.println(e);
			}
			return list;
		}
		
		
}
