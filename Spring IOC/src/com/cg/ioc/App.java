package com.cg.ioc;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("emp.xml");
			Employee emp=(Employee) context.getBean("emp");
			System.out.println(emp.getEmpno());
			System.out.println(emp.getName());
			for(String email:emp.getList()){
				System.out.println(email);
			}
			Map<String,String> map=emp.getExp();
			map.values();
			
		}
}
