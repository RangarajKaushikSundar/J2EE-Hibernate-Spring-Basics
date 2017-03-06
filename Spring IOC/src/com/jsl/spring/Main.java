package com.jsl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.di.Employee;

public class Main {
	public static void main(String[] args) {
		
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"diemp.xml","welcome.xml"});
			ExampleBean bean=(ExampleBean) context.getBean("beanlife");
			bean.somemethod();
			context.close();
	}
}
