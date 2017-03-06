package com.jsl.spring.di;

public class Employee {
	private String empno;
	private String ename;
	private Address address;

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
}