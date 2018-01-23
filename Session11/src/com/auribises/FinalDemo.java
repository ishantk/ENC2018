package com.auribises;

final class CO{
	final void show(){
		
	}
}

class CT{ // extends CO{ // err
	//void show(){ error
		
	//}
}

interface Inf{
	int i=10; // public static final int i = 10;
	//void show();
}

class CTH implements Inf{
	
}


public class FinalDemo {

	static int i;
	
	public static void main(String[] args) {
		
		System.out.println("Inf i is: "+Inf.i);
		System.out.println("CTH i is: "+CTH.i);
		
		//int i; // Blank Variable
		//i = 10;
		//i++; // Initialization Before Use
		//i = 100;
		
		
		final int j; // Blank Final Variable;
		j = 10;
		//j = 100; err
		
		final int k = 10; // Final Variable
		//k = 100; // err

	}

}
