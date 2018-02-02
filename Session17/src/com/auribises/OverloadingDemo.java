package com.auribises;

/*
 * Overloading
 * 1. Function Name Should be Same
 * 2. Input Should be Unique and Different
 *  	  2.1 Number of Arguments or Inputs
 *  	  2.2 Type of Arguments or Inputs
 *  	  2.3 Sequence of Arguments or Inputs
 * 3. Return Type has no Role to play
 * 
 */

class Facebook{
	
}

class Google{
	
}

class Login{
	void loginUser(String email, String password){
		
	}
	
	void loginUser(String phoneNum, int otp){
		
	}
	
	void loginUser(Facebook fbRef){
		
	}
	
	void loginUser(Google gRef){
		
	}
}

public class OverloadingDemo {

	// 2.1
	void fun(){
		System.out.println("This is fun");
	}
	
	void fun(int i){
		System.out.println("This is some more fun");
	}
	
	/*int fun(int i){
		System.out.println("This is some more fun");
		return 0;
	}*/
	
	void fun(int i, int j){
		System.out.println("This is some more fun");
	}
	
	// 2.2
	void fun(float i, float j){
		System.out.println("This is some more fun");
	}
	
	// 2.3
	void fun(int i, float j){
		System.out.println("This is some more fun");
	}
	
	void fun(float i, int j){
		System.out.println("This is some more fun");
	}
	
	
	public static void main(String[] args) {
		
		OverloadingDemo oRef = new OverloadingDemo();
		oRef.fun();
		
		Login login = new Login();
		login.loginUser("+91 892387654", 3001);

	}

}
