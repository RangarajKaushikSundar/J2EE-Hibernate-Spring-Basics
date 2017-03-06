package com.cg.ioc;

import java.util.List;
import java.util.Map;

public class Employee {
		private int empno;
		private String name;
		private List<String> list;
		private Map<String,String> exp;
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getList() {
			return list;
		}
		public void setList(List<String> list) {
			this.list = list;
		}
		public Map<String,String> getExp() {
			return exp;
		}
		public void setExp(Map<String,String> exp) {
			this.exp = exp;
		}
		
}
