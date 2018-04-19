package com.auribises.model;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {
		System.out.println("======before======");
		
		System.out.println("Method Name is: "+method.getName());
		System.out.println("Inputs to the Method: ");
		for(Object o : objArr){
			System.out.println(o);
		}
		System.out.println("obj is: "+obj);
		
		
		System.out.println("======before======");
	}

}
