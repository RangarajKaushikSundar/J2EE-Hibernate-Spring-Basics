package com.cg.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("pros.xml");
			PropertyDemo obj=(PropertyDemo) context.getBean("props");
			System.out.println(obj.getEmail());
			System.out.println(obj.getPassword());
		}
}
