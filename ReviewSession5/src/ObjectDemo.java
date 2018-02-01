class User{
	String name;
	String phone;
	String email;
	int age;
	char gender;
	String address;
}


public class ObjectDemo {

	public static void main(String[] args) {
		
		int i = 10;
		int[] arr = {10,20,30,40,50};
		
		// Object Construction Statement
		User u1 = new User();
		// u1 is a reference variable having the address of an object
		// u1 is created in stack, object is created in heap
		
		User u2 = new User();
		
		int j = i; // Value Copy
		User u3 = u1; // Reference Copy
		
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
		
		// Write Data in Object
		u1.name = "John";
		u1.age = 30;
		u1.phone = "+91 999876567";
		u1.email = "john@example.com";
		u1.gender = 'M';
		
		u2.name = "Jennie";
		u2.age = 29;
		u2.phone = "+91 456780981";
		u2.email = "jennie@example.com";
		u2.gender = 'F';

		u3.phone = "+91 345678980";
		// Read data from Object
		System.out.println(u1.name+" can be called at "+u1.phone);
		System.out.println(u3.name+" can be called at "+u3.phone);
		System.out.println(u2.name+" can be called at "+u2.phone);
	}

}
