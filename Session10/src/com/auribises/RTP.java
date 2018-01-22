package com.auribises;

class Cab{
	
	Cab(){
		System.out.println("Cab Object Constructed");
	}
	
	void bookCab(){
		System.out.println("Book a Cab");
	}
}

class MicroCab extends Cab{ // IS-A Relation
	
	MicroCab(){
		System.out.println("MicroCab Object Constructed");
	}
	
	void bookCab(){
		System.out.println("Book a MicroCab");
	}
}

class MiniCab extends Cab{
	MiniCab(){
		System.out.println("MiniCab Object Constructed");
	}
	
	void bookCab(){
		System.out.println("Book a MiniCab");
	}
}

class Bike extends Cab{
	Bike(){
		System.out.println("Bike Object Constructed");
	}
	
	void bookCab(){
		System.out.println("Book a Bike");
	}
}

class Auto extends Cab{
	Auto(){
		System.out.println("Auto Object Constructed");
	}
	
	void bookCab(){
		System.out.println("Book an Auto");
	}
}

public class RTP {

	public static void main(String[] args) {

		/*Cab cRef;
		cRef = new Cab();
		
		cRef.bookCab();*/
		
		/*MicroCab mRef;
		mRef = new MicroCab();
		
		mRef.bookCab();*/
		
		Cab cRef;
		cRef = new MicroCab(); // Polymorphic Statement
		cRef.bookCab();
		
		System.out.println("----------------");
		
		cRef = new MiniCab();
		cRef.bookCab();
		
		System.out.println("----------------");
		
		cRef = new Bike();
		cRef.bookCab();
		
		System.out.println("----------------");
		
		cRef = new Auto();
		cRef.bookCab();
	}

}
