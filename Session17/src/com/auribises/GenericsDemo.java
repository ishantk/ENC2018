package com.auribises;

class Point<T,U>{
	
	T x;
	T y;
	U z;
	
	Point(T x, T y, U z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public String toString() {
		String str = "Point is: "+x+" : "+y+" : "+z;
		return str;
	}
}

public class GenericsDemo {

	public static void main(String[] args) {

		Point<Integer,Integer> p1 = new Point<Integer,Integer>(10, 20, 30);
		Point<Float,Integer> p2 = new Point<Float,Integer>(10.1f, 20.2f, 50);
		Point<String,Double> p3 = new Point<String,Double>("A", "B", 10.56);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
