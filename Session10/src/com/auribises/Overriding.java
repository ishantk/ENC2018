package com.auribises;

class Parent{
	public void purchaseBike(){
		System.out.println("Lets Purchase Bajaj Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets purchase Maruti Swift");
	}
}

class Son extends Parent{
	
	// OverRiding
	public void purchaseBike(){
		super.purchaseBike();
		System.out.println("Lets Purchase Royal Enfield");
	}
	
	// Hiding
	static void purchaseCar(){
		Parent.purchaseCar();
		System.out.println("Lets purchase Honda City");
	}
	
}

public class Overriding {

	public static void main(String[] args) {

		Son s = new Son();
		s.purchaseBike();
		
		Son.purchaseCar();
	}

}
