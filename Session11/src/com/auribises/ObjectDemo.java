package com.auribises;

class Student{// extends Object{
	
	// Overriding
	public String toString(){
		String str = "This is Awesome..."+" - "+super.toString();
		return str;
	}
}

class FbUser extends Student{
	
}

class Product{
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Object o;
		o = new Student();
		o = new FbUser();
		o = new Product();
		
		System.out.println(s1); // System.out.println(s1.toString());
		System.out.println(s1.toString());
				
		String str1 = new String("Hello");
		System.out.println(str1);
		System.out.println(str1.toString());
		
	}

}
