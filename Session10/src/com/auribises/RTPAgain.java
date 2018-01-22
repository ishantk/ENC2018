package com.auribises;

/*class Shape{
	Shape(){
		System.out.println("Shape Object Conctructed");
	}
	
	void draw(){
		System.out.println("Drawing a Shape");
	}
}*/

/*abstract class Shape{
	
	Shape(){
		System.out.println("Shape Object Conctructed");
	}
	
	abstract void draw();
	//abstract void draw1();
	
	void fun(){
		System.out.println("This is fun");
	}
	
}*/

interface Shape{
	
	/*Shape(){ error
		System.out.println("Shape Object Conctructed");
	}*/
	
	void draw(); // public abstract void draw();
	
	/*void fun(){ error
		System.out.println("This is fun");
	}*/
	
}

class Circle implements Shape{//extends Shape{
	Circle(){
		System.out.println("Circle Object Conctructed");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Triangle implements Shape{//extends Shape{
	Triangle(){
		System.out.println("Triangle Object Conctructed");
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle");
	}
}

class Polygon implements Shape{ //extends Shape{
	Polygon(){
		System.out.println("Polygon Object Conctructed");
	}
	
	public void draw(){
		System.out.println("Drawing a Polygon");
	}
}

public class RTPAgain {

	public static void main(String[] args) {

		Shape s;
		
		s = new Circle();
		s.draw();
		
		System.out.println("----------------");
		
		s = new Triangle();
		s.draw();
		
		System.out.println("----------------");
		
		s = new Polygon();
		s.draw();
		
		System.out.println("----------------");
		
		//s = new Shape();
		//s.draw();
	}

}
