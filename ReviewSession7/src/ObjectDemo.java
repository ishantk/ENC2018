class User{
	
	// Attributes
	String name;
	String phone;
	String email;
	int age;
	char gender;
	String address;
	
	static String appName;
	
	// Methods
	// 1. Business Method : Process the data logically
	// 2. Setter(Write) and Getters(Read)
	
	// Setter
	void setName(String n){
		name = n;
	}
	
	// Getter
	String getName(){
		return name;
	}
	
	void showUserDetails(){
		System.out.println(name+" is "+age+" years old");
	}
	
	static void showAppName(){
		System.out.println("App Name "+appName);
	}
	
}


public class ObjectDemo {

	public static void main(String[] args) {
		
		// Primitive Type
		int i = 10; // Single Value Container
		// int j = 10,20; error
		
		// Homogenous
		// Reference Type
		int[] arr = {10,20,30,40,50}; // Array | Multi Value Container
		
		// Object Construction Statement
		// Reference Type
		User u1 = new User();
		// u1 is a reference variable
		User u2 = new User();
		
		
		System.out.println(i);
		System.out.println(arr);
		System.out.println(u1);
		System.out.println(u2);
		
		// Write the data in Object
		u1.name = "John";
		u1.age = 30;
		u1.gender = 'M';
		
		u2.name = "Jennie";
		u2.age = 26;
		u2.gender = 'F';
		
		// Write the data in Class
		User.appName = "FaceBook";
		
		// Property of Class can be accessed by Objects
		// Property of Object cannot be accessed by Class
		
		// Read the data from Object
		//System.out.println(u1.name+" is "+u1.age+" years old and is a user of "+User.appName);
		//System.out.println(u2.name+" is "+u2.age+" years old and is a user of "+User.appName);
		//System.out.println(u1.name+" is "+u1.age+" years old and is a user of "+u1.appName);
		//System.out.println(u2.name+" is "+u2.age+" years old and is a user of "+u2.appName);
		
		//System.out.println(User.name+" is "+User.age+" years Old"); err
		
		
		u1.showUserDetails();
		u2.showUserDetails();
		
		User.showAppName();
	}

}
