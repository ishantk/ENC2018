package com.auribises;


class User{
	
	// Attributes
	String name;
	byte age;
	String phone;
	String email;
	char gender;
	
	// Constructor
	User(){
		name = "NA";
		age = 0;
		phone = "NA";
		email = "NA";
		gender = 'U';
		System.out.println("User Object Constructed");
	}
	
	// Method
	void showUserDetails(){
		System.out.println(name+" can be called at "+phone);
	}
}

class FaceBookUser extends User{
	
	String status;
	
	FaceBookUser() {
		System.out.println("FaceBookUser Object Constructed");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {

		//User u1 = new User(); // Object Construction
		//System.out.println("u1 is "+u1);
		//u1.name = "John";
		//u1.phone = "+91 99999 54322";
		
		//u1.showUserDetails();
		
		FaceBookUser fbUser = new FaceBookUser();
		fbUser.showUserDetails();
	}

}
