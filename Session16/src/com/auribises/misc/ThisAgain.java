package com.auribises.misc;

class Point{
	
	int x;
	int y;
	
	Point(){
		//System.out.println("this is: "+Point.this);
		System.out.println("this is: "+this);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Parent{
	void purchaseBike(){
		System.out.println("Lets buy Pulsar");
	}
}

class Child extends Parent{
	void purchaseBike(){
		System.out.println("Lets buy Enfield");
		super.purchaseBike();
	}
}

public class ThisAgain {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		System.out.println("p1 is: "+p1);
		System.out.println("p2 is: "+p2);

		Child ch = new Child();
		ch.purchaseBike();
	}

}
