class Counter{
	
	// Attributes
	int count = 1;
	static int scount = 1;
	
	void incrementCount(){
		count++;
		scount++;
	}
	
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("scount is: "+scount);
	}
	
	/*static void showStaticCount(){
		System.out.println("count is: "+count);
		System.out.println("scount is: "+scount);
	}*/
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		c1.incrementCount();
		c2.incrementCount();
		c1.incrementCount();
		
		c1.incrementCount();
		c2.incrementCount();
		
		c2.incrementCount();
		
		c2.incrementCount();
		c1.incrementCount();
		
		c1.showCount();
		c2.showCount();
		
	}

}
