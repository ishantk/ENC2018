package com.aurbises.model;

// Model or Bean or POJO (Plain Old Java Object)
public class Employee {

	// Attributes
	int id;
	String name;
	int salary;
	String email;
	String address;
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, int salary, String email, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", address="
				+ address + "]";
	}
	
}
