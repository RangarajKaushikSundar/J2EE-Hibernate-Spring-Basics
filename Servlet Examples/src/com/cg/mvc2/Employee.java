package com.cg.mvc2;

public class Employee {
		private int empno;
		private String ename;
		private String job;
		
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getEname() {
			return ename;
		}
		@Override
		public String toString() {
				return empno+ " "+ename+" "+job;
		}
}
