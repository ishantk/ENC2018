class User{
	// Attributes
	String name;
	String phone;
	String email;
	int age;
	char gender;
	
	Address adrs; // HAS-A Relation
}

class Address{
	// Attributes
	String adrsLine;
	String city;
	String state;
	int zipCode;	
}


public class ObjectDemo {

	public static void main(String[] args) {
		
		User u1 = new User();
		User u2 = new User();
		
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);

		Address a1 = new Address();
		Address a2;
		a2 = new Address();
		
		// Write Data in Object
		u1.name = "John";
		u1.phone = "+91 9876543678";
		u1.email = "john@example.com";
		u1.gender = 'M';
		u1.age = 30;
		
		u2.name = "Jennie";
		u2.phone = "+91 4567986778";
		u2.email = "jennie@example.com";
		u2.gender = 'F';
		u2.age = 20;
		
		a1.adrsLine = "Country Homes";
		a1.city = "Ludhiana";
		a1.state = "Punjab";
		a1.zipCode = 141002;
		
		a2.adrsLine = "Pristine Homes";
		a2.city = "Bengaluru";
		a2.state = "Karnataka";
		a2.zipCode = 520001;
		
		u1.adrs = a1;
		u2.adrs = a2;
		
		// Read the data
		System.out.println(u1.name +" can be called at "+u1.phone+" and is "+u1.age+" years old");
		System.out.println(u2.name +" can be called at "+u2.phone+" and is "+u2.age+" years old");
		
		
		System.out.println(u1.name +" lives at "+u1.adrs.adrsLine+" in "+u1.adrs.city);
		System.out.println(u2.name +" lives at "+u2.adrs.adrsLine+" in "+u2.adrs.city);
	}

}
