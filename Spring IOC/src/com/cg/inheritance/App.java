package com.cg.inheritance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("inheritance.xml");
			Employee emp=context.getBean(Employee.class);
			System.out.println(emp.getFname());
			System.out.println(emp.getEmail());
			System.out.println(emp.getSalary());
		}
}
