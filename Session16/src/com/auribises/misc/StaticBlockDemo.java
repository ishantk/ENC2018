package com.auribises.misc;

class Student{
	
	{
		System.out.println("Student Block");
	}
	
	static {
		System.out.println("Student Static Block");
	}
	
	Student(){
		System.out.println("Student Object Created..");
	}

}

public class StaticBlockDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Started..");
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println("Main Finsihed..");

	}

}
