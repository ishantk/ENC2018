package com.auribises.model;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object obj, Method method, Object[] objArr, Object obj1) throws Throwable {
		System.out.println("======after======");
		
		System.out.println("Method Name is: "+method.getName());
		System.out.println("Inputs to the Method: ");
		for(Object o : objArr){
			System.out.println(o);
		}
		System.out.println("obj is: "+obj);
		System.out.println("obj1 is: "+obj1);
		
		
		System.out.println("======after======");
	}

}
