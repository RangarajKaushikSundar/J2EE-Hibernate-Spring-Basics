package com.cg.welcome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("welcome.xml");
			HelloWorld obj=context.getBean(HelloWorld.class);
			HelloWorld obj1=(HelloWorld) context.getBean("hello");
			
		}
}
