package com.auribises.misc;

public class Misc {

	Misc(){
		System.out.println("Object Created...");
	}
	
	// Initializer Block - Property of Object
	{
		System.out.println("Block1...");
	}
	
	{
		System.out.println("Block2...");
	}
	
	// Initializer Block - Property of Class
	static{
		System.out.println("Static Block1...");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Started...");

		Misc m1 = new Misc();
		
		System.out.println("Main Finished...");
		
	}

}
