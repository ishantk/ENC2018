package com.auribises.misc;

class A{
	
	A(){
		this(10);
		System.out.println("In A ");
	}
	
	A(int x){
		//this();
		System.out.println("In A "+x);
	}
}

class B extends A{
	B(){
		super(10);
		System.out.println("In B ");
	}
}

class C extends B{
	C(){
		System.out.println("In C ");
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		
		C c = new C();

	}

}
