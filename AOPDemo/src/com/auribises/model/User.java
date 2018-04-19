package com.auribises.model;

import java.util.Date;

public class User {
	
	String name;
	String email;
	String password;

	public User(){
		
	}
	
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// Business Method
	void showUser(String dept, int floor){
		System.out.println("Welcome, Its: "+new Date());
		System.out.println("Dear, "+name+"\nYou have been allocated "+dept+" department. Your sitting arrangement is on "+floor+" floor");
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
