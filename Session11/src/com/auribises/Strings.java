package com.auribises;

class User{
	
}

public class Strings {

	public static void main(String[] args) {
		
		// Interned Strings
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Non-Interned Strings
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		if(str1 == str2){ // Reference Comparison
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1 == str3){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		
		User u1 = new User();
		User u2 = new User();
		
		if(u1 == u2){
			System.out.println("u1 == u2");
		}else{
			System.out.println("u1 != u2");
		}
		
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
	}

}
