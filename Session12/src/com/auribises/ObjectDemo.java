package com.auribises;

class User{ //extends Object{
	
	public String toString() {
		String str = "Be Exceptional !!";
		return str;
	}
}

class Student{ // Object
	
}

class MyString{
	
	String s;
	
	MyString(String q){
		s = q;
	}
	
	public String toString() {
		return s;
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) {

		User u1 = new User();
		User u2 = new User();
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
		
		System.out.println("u1 toString is: "+u1.toString());
		
		System.out.println("u1 hashcode is: "+u1.hashCode());
		System.out.println("u2 hashcode is: "+u2.hashCode());
		
		System.out.println("u1 class is: "+u1.getClass());
	
		String str1 = new String("Hello");
		
		String str2 = "This is Great";
		
		System.out.println(str1);
		System.out.println(str2);
		
		MyString str = new MyString("Hello");
		System.out.println(str); // Hello
		
		// RTP
		Object oRef;
		oRef = new User();
		oRef = new Student();
		oRef = new String();
	}

}
