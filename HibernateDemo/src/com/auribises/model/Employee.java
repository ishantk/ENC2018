package com.auribises.model;

public class Employee {
	
	// Attributes
	public Integer eid;
	public String name;
	public String email;
	public Integer salary;
	public String address;
	
	public Employee(){
		
	}
	
	public Employee(Integer eid, String name, String email, Integer salary, String address) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.address = address;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
}
