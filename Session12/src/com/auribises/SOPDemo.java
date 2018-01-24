package com.auribises;

class SSystem{
	static PPrintStream oout = new PPrintStream();
}

class PPrintStream{
	void pprintln(String str){
		System.out.println(str);
	}
}

public class SOPDemo {

	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		
		SSystem.oout.pprintln("Hello World");

	}

}
