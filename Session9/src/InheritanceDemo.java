class Parent{
	Parent(){
		System.out.println("Parent Object Constructed");
	}
	
	void fun(){
		System.out.println("This is fun");
	}
	
	static void bye(){
		System.out.println("Bye for Now...");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Object Constructed");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.fun();
		
		Child.bye();
	}

}
