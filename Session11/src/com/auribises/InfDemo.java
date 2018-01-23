package com.auribises;

/*abstract class Shape{
	Shape(){
		System.out.println("Shape Object Created");
	}
	
	// It is a RULE
	abstract void draw();
}*/

interface Shape{
	/*Shape(){
		System.out.println("Shape Object Created");
	}*/
	
	// It is a RULE
	void draw(); // public abstract void draw();
}

class Circle implements Shape{//extends Shape{ // IS-A
	Circle(){
		System.out.println("Circle Object Created");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Triangle implements Shape{//extends Shape{ // IS-A
	Triangle(){
		System.out.println("Triangle Object Created");
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		// RUN TIME POLYMORPHISM
		
		Circle c = new Circle();
		Triangle t = new Triangle();
		
		/*Shape s = new Circle(); // Polymorphic Statement
		s.draw();
		s.draw();
		
		System.out.println("---------------");
		
		s = new Triangle();
		s.draw();*/
		
		Shape s = c;
		s.draw();
		
		s = t;
		s.draw();
	}

}
