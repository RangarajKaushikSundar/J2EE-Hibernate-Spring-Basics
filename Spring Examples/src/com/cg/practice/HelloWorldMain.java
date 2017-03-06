package com.cg.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("hello.xml");
		HelloWorld object=(HelloWorld) context.getBean("welcome");
		System.out.println(object.getMessage());
	}
}
