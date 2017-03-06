package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"diemp.xml","welcome.xml"});
			Employee emp=(Employee)context.getBean("diemp");
			System.out.println(emp.getEmpno());
			System.out.println(emp.getEname());
			System.out.println(emp.getJob());
			System.out.println(emp.getSalary());
			System.out.println(emp.getProject().getPname());
		}
}
