class Counter{
	
	// Attribute - Non Static | Property of Object
	int count = 1;
	
	// Attribute - Static | Property of Class
	static int scount = 1;
	
	// Methods | Property of Object
	void incrementCount(){
		count++;
		scount++;
	}
	
	// Property of Class can be accessed by property of Object
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("scount is: "+scount);
	}
	
	// Methods | Property of Class
	
	// Property of Object cannot be accessed by property of Class
	static void showSCount(){
		// System.out.println("count is: "+count); error
		System.out.println("scount is: "+scount);
	}
	
}


public class StatDemo {

	public static void main(String[] args) {
		
		// Object Construction
		Counter c1 = new Counter();
		System.out.println("c1 is: "+c1);

		Counter c2 = new Counter();
		System.out.println("c2 is: "+c2);
		
		Counter c3 = c1; // Reference Copy
		System.out.println("c3 is: "+c3);
		
		
		Counter c4 = c3;
		
		c1.incrementCount(); // 2
		c2.incrementCount(); // 2
		c3.incrementCount(); // 3
		
		c3.incrementCount(); // 4
		c2.incrementCount(); // 3
		
		c1.incrementCount(); // 5
		c2.incrementCount(); // 4
		c1.incrementCount(); // 6
		
		c2.incrementCount(); // 5
		
		c1.showCount(); // 6  
		c2.showCount(); // 5  
		c3.showCount(); // 6  
		//c4.showCount();
	}

}
