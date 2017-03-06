package com.cg.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
		
		private String empno;
		private String ename;
		private String emai;
		public String getEmpno() {
			return empno;
		}
		@Required
		public void setEmpno(String empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		
		public String getEmai() {
			return emai;
		}
		
		public void setEmai(String emai) {
			this.emai = emai;
		}
}
