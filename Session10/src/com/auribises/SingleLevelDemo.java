package com.auribises;

class Father{
	
	String fname;
	String lname;
	int money;
	
	static String quote;
	
	Father(){
		fname = "John";
		lname = "Watson";
		money = 50000;
		System.out.println("Father Object Constructed");
	}
	
	void showFatherDetails(){
		System.out.println(fname+" "+lname+" has \u20b9"+money);
	}
	
	static void showQuote(){
		System.out.println("quote is: "+quote);
	}
	
}

class Child extends Father{
	
	int vehicles;
	static String hobby;
	
	Child(){
		//fname = "George";
		//vehicles = 3;
		System.out.println("Child Object Constructed");
	}
	
	void showChildDetails(){
		System.out.println(fname+" "+lname+" has \u20b9"+money+" and owns "+vehicles+" vehicles");
	}
	
	static void showHobby(){
		System.out.println("hobby is: "+hobby);
	}
}

public class SingleLevelDemo {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.fname = "Jennie";
		ch.vehicles = 2;
		ch.lname = "McWe";
		ch.money = 30000;
		ch.showChildDetails();
		
		Child.quote = "Be Exceptional";
		Child.hobby = "Music";
		
		Child.showQuote();
		Child.showHobby();
	}

}
