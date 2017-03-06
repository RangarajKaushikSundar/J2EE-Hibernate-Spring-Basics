package com.cg.practice_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("connection.xml");
		PersonContainer object=(PersonContainer) context.getBean("personContainer");
		//System.out.println(object.getCount());
		for(Person p:object.getNames()){
			System.out.println(p.getPerson_name());
		}
	}
}
