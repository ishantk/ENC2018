class Parent{
	
	Parent(){
		System.out.println("Parent Object Created");
	}
	
	// Attributes : Non Static
	String fname;
	String lname;
	
	// Attributes : Static
	static int money;
	
}

class Child extends Parent{
	Child(){
		System.out.println("Child Object Created");
	}
}

class A {
	
	// Constructor
	A(){
		System.out.println("A Object Created");
	}
}


class B {
	
	// Constructor
	B(){
		System.out.println("B Object Created");
	}
}

/*class C extends A, B{
	
}*/

public class Inheritance {

	public static void main(String[] args) {
		
		//Parent p = new Parent();
		//System.out.println(p);
		
		Child ch = new Child();
		ch.fname = "John";
		ch.lname = "Watson";
		
		Child.money = 10000;
		
		//A a = new A();
		
	}
}
