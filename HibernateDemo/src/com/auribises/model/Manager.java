package com.auribises.model;

import java.util.List;

public class Manager {

	Integer mid;
	String name;
	String email;
	Integer salary;
	
	// One to Many
	List<Certificate> certificates; // HAS-A Relation

	public Manager(){
		
	}
	
	public Manager(Integer mid, String name, String email, Integer salary, List<Certificate> certificates) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.certificates = certificates;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
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

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", email=" + email + ", salary=" + salary + ", certificates="
				+ certificates + "]";
	}

}
