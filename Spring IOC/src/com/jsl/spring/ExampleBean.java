package com.jsl.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean {
	public void somemethod() {
		System.out.println("---------Some other method-------");
	}


	public void afterPropertiesSet() throws Exception {
		System.out.println("----- Initilization--------");
	}


	public void destroy() throws Exception {
		System.out.println("-----------The distructmethod-------------");
	}
}