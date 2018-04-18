package com.auribises.view;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object obj, String str) throws BeansException {
		
		System.out.println("****postProcessAfterInitialization*****");
		System.out.println("obj is: "+obj);
		System.out.println("str is: "+str);
		
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String str) throws BeansException {
		
		System.out.println("****postProcessBeforeInitialization*****");
		System.out.println("obj is: "+obj);
		System.out.println("str is: "+str);
		
		return obj;
	}

}
