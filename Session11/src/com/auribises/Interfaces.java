package com.auribises;

interface Inf1{
	void show();
	void fun();
}

interface Inf2{
	void bye();
	//void fun();
}

class A{
	
}

class B{
	
}

/*class C extends A,B{ err
	
}*/

interface Inf3 extends Inf1,Inf2{
	void hello();
}

class CA implements Inf3{//Inf1,Inf2{

	public void bye() {
		System.out.println("This is bye");
	}


	public void show() {
		System.out.println("This is show");
	}

	public void fun() {
		System.out.println("This is fun");
	}
	
	public void hello(){
		System.out.println("This is hello");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		
		// Direct Object Creation
		/*CA ca = new CA();
		ca.show();
		ca.fun();
		ca.bye();*/
		
		/*CA ca = new CA();
		
		Inf1 i1 = ca;//new CA();
		i1.show();
		i1.fun();
		//i1.bye();
		
		Inf2 i2 = ca;//new CA();
		i2.bye();*/
		
		Inf3 i3 = new CA();
		i3.show();
		i3.hello();
		i3.fun();
		i3.bye();
		

	}

}
