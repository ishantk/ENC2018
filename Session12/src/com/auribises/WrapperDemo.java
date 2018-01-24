package com.auribises;

class MyInteger{
	
	int i;
	
	MyInteger(int k){
		i = k;
	}
	
	int intValue(){
		return i;
	}
	
	public String toString() {
		return String.valueOf(i);
	}
}

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 10; // Primitive Type
		
		// Boxing
		Integer iRef = new Integer(i); // Reference Type

		char ch = 'A';
		Character cRef = new Character(ch);
		
		float f = 2.2f;
		Float fRef = new Float(f);
		
		// UnBoxing
		int j = iRef.intValue();
		char dh = cRef.charValue();
		float g = fRef.floatValue();
		
		// Auto Boxing
		Integer iRef1 = i; // Integer iRef1 = new Integer(i);
		
		// Auto UnBoxing
		int k = iRef1; // int k = iRef1.intValue(); 
		
		System.out.println("iRef is: "+iRef);
		System.out.println("cRef is: "+cRef);
		System.out.println("fRef is: "+fRef);
		
		MyInteger mRef = new MyInteger(i);
		System.out.println(mRef); // Address
		System.out.println(mRef.intValue()); // Value
		
	}

}
