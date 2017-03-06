package com.jsl.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"emp.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("The Employee Details are : ");
		System.out.println("Empno is :" + emp.getEmpno());
		System.out.println("Ename is :" + emp.getEname());
		System.out.println("City is :" + emp.getAddress().getCity());
		System.out.println("State is :" + emp.getAddress().getState());
		System.out.println("Country is :" + emp.getAddress().getCountry());
	}
}