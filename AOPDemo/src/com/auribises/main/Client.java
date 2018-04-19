package com.auribises.main;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribises.model.User;

public class Client {

	public static void main(String[] args) {
		
		// Spring AOP Code
		// IOC Container : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		User user = context.getBean("userProxy",User.class);
		user.showUser("R&D", 3);

	}

}
