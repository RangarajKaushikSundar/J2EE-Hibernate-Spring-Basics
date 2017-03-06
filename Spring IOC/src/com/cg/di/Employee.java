package com.cg.di;

public class Employee {
		private int empno;
		private String ename;
		private String job;
		private int salary;
		private Project project;
		public int getEmpno() {
			return empno;
		}
		public String getEname() {
			return ename;
		}
		public String getJob() {
			return job;
		}
		public Employee(int empno, String ename, String job,int salary,Project project) {
			super();
			this.empno = empno;
			this.ename = ename;
			this.job = job;
			this.salary=salary;
			this.setProject(project);
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public Project getProject() {
			return project;
		}
		public void setProject(Project project) {
			this.project = project;
		}
}
