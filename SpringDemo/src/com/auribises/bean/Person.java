package com.auribises.bean;

import java.util.List;

public class Person {
	
	String name;
	String email;
	int age;
	
	Address adrs;
	List<String> certificates;

	public Person(){
		
	}
	
	public Person(Address adrs) {
		System.out.println("==DI with Constructor==");
		this.adrs = adrs;
	}
	
	public Person(String name, String email, int age, Address adrs) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.adrs = adrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		System.out.println("==DI with Setter==");
		this.adrs = adrs;
	}


	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", adrs=" + adrs + "]";
	}
	
}
