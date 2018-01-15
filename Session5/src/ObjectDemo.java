// Textually Represent Object called User

class User {
	
	// Attributes
	
	String name;
	private String phone;
	String email;
	int age;
	char gender;
	String address;
	
	//Methods or Functions or Behavior or Procedure or Routine
	// Setter Method | Write the data in phone
	void setPhone(String p){
		phone = p;
	}
	
	// Getter Method | Read the data from phone
	String getPhone(){
		return phone;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
	
		int i = 10;
		int p = i; // Value Copy
		int[] j = {10,20,30,40,50};
		
		// Object Construction Statement
		User u1 = new User();
		User u2 = new User();
		
		User u3 = u1; // Reference Copy
		
		System.out.println("i is: "+i);
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
		
		
		// Write the data in Object
		u1.name = "John";
		//u3.phone = "+91 9876543456";
		u3.setPhone("+91 9876543456");
		u1.email = "john@example.com";
		u3.age = 30;
		u1.gender = 'M';
		u1.address = "Country Homes";
		
		u2.name = "Jennie";
		//u2.phone = "+91 98765436786";
		u2.setPhone("+91 98765436786");
		u2.email = "jennie@example.com";
		u2.age = 28;
		u2.gender = 'F';
		u2.address = "Redwood Shores";
		
		// Read the data from Object
		//System.out.println(u1.name +" is "+u1.age+" years old and can be contacted at "+u3.phone);
		//System.out.println(u2.name +" is "+u2.age+" years old can be contacted at "+u2.phone);
		
		System.out.println(u1.name +" is "+u1.age+" years old and can be contacted at "+u3.getPhone());
		System.out.println(u2.name +" is "+u2.age+" years old can be contacted at "+u2.getPhone());
	}

}
