package com.cg.dbconnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
			DbOperations ob=context.getBean(DbOperations.class);
			System.out.println(ob.getCount());
			
		}
}
