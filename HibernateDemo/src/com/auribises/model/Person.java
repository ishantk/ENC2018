package com.auribises.model;

import java.util.ArrayList;

public class Person {
	
	// Attributes
	Integer pid;
	String name;
	String email;
	Integer age;
	
	// One to One
	Address address; // HAS-A Relation
	
	// One to Many
	//ArrayList<Address> addresses;

	public Person(){
		
	}
	
	public Person(Integer pid, String name, String email, Integer age, Address address) {
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", email=" + email + ", age=" + age + ", address=" + address
				+ "]";
	}
	
}
