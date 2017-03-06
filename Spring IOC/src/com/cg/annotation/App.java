package com.cg.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("empannotation.xml");
			Employee emp=(Employee) context.getBean("emp");
			System.out.println(emp.getEmai());
			System.out.println(emp.getEname());
			System.out.println(emp.getEmpno());
			
			
		}
}
