package com.cg.listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class Attribute implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent scab) {
			System.out.println(scab.getName()+" is added");
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		System.out.println(scab.getName()+" is removed");
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		System.out.println(scab.getName()+" is replaced");
		
	}

}
