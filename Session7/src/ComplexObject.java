class Person{
	String name;
	byte age;
	char gender;
	
	Address address; // Reference Variable which can point to the object of Address
	
	String qualification;
	String dob;
	
	Job job;
	
	// Method
	void showPersonDetails(){
		System.out.println("Person Details: ");
		System.out.println(name+" is "+age+" years old and is "+qualification+" in qualification");
		System.out.println("Address Details: ");
		address.showAddressDetails();
		System.out.println("Job Details: ");
		job.showJobDetails();
	}
}

class Address{
	String adrsLine;
	String city;
	String state;
	int zipCode;
	
	void showAddressDetails(){
		System.out.println(adrsLine+" is in "+city+" having a zipCode "+zipCode);
	}
}

class Job{
	String compName;
	int salary;
	String designation;
	
	void showJobDetails(){
		System.out.println(designation+" receives a salary of \u20b9"+salary+" in "+compName);
	}
}


public class ComplexObject {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("p1 is: "+p1);
		
		Address a1 = new Address();
		System.out.println("a1 is: "+a1);
		
		// Write the data in Address Object
		a1.adrsLine = "Country Homes North";
		a1.city = "Ludhiana";
		a1.state = "Punjab";
		a1.zipCode = 141002;
		
		Job j1 = new Job();
		j1.compName = "Auribises";
		j1.designation = "Software Engineer";
		j1.salary = 15000;
		
		// Write the data in Person Object
		p1.name = "John";
		p1.age = 30;
		p1.gender = 'M';
		p1.qualification = "Masters";
		p1.dob = "1/1/1990";
		
		// Person Has An Address
		p1.address = a1; // Reference Copy
		
		System.out.println("p1.aaddress is: "+p1.address);
		
		Address a2 = new Address();
		a2.adrsLine = "Redwood Shores";
		a2.city = "Bengaluru";
		a2.state = "Karnataka";
		a2.zipCode = 520001;
		
		Person p2 = new Person();
		p2.name = "Jennie";
		p2.age = 28;
		p2.qualification = "Masters";
		p2.dob = "2/2/1990";
		p2.address = a2;
		
		
		p1.job = j1;
		p2.job = j1;
		
		
		p1.showPersonDetails();
		//p1.address.showAddressDetails();
		
		System.out.println("------------------");
		
		p2.showPersonDetails();
		//p2.address.showAddressDetails();

	}

}
