package com.auribises.main;

import java.beans.PersistenceDelegate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.auribises.bean.Person;
import com.auribises.view.Button;

public class Client {

	public static void main(String[] args) {
		
		// Traditional Java Way
		
		/*Button btn = new Button();
		btn.setWidth(100);
		btn.setHeight(50);
		btn.setId(101);
		btn.setColor("Red");
		btn.setText("Submit");
		
		Button btnRef = new Button(200,80,"Register","Green",201);
		
		System.out.println(btn);
		System.out.println(btnRef);*/
		
		// Spring Way | IOC
		// 1. BeanFactory | IOC Container 
		
		//Resource resource = new ClassPathResource("application.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		//Button b1 = (Button)factory.getBean("btn1");
		//Button b2 = factory.getBean("btn2",Button.class);
		
		//System.out.println(b1);
		//System.out.println(b2);
		
		// 2. ApplicationContext | IOC Container 
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		//Button b1 = (Button)context.getBean("btn1");
		//Button b2 = (Button)context.getBean("btn1");
		//Button b2 = context.getBean("btn2",Button.class);
		
		//System.out.println(b1);
		//System.out.println(b2);
		
		Person p1 = context.getBean("pRef",Person.class);
		System.out.println(p1);
		
		System.out.println(p1.getCertificates());
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}
	

}
