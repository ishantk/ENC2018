
public class Methods {

	// Non Static Method
	void sayHello(){
		System.out.println("Hello Dear, This is a non static Method !!");
		System.out.println("Hello Dear, Its a Great Day !!");
		System.out.println("Do Something Meaningful today !!");
	}
	
	// Static Method
	static void sayHelloAgain(){
		System.out.println("Hello Dear, This is a static Method !!");
		System.out.println("Hello Dear, Its a Great Day !!");
		System.out.println("Do Something Meaningful today !!");
	}
	
	void addNums(String name, int n1, int n2){
		int n3 = n1+n2;
		System.out.println("Dear, "+name+" n3 is: "+n3);
	}
	
	
	float calculateAreaOfCircle(float radius){
		
		float area = 3.14f * radius * radius;
		
		String str = "John Watson, Area is: "+area;
		
		System.out.println("Calculating Area for "+radius+" ..... ");
		
		return area; // Ack
		
	}
	
	static void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	public static void main(String[] args) {
		
		// To Execute Non Static Method, Create an Object
		Methods mRef = new Methods();
		mRef.sayHello(); // Calling a Method or Executing a Method

		mRef.addNums("John",10, 20);
		mRef.addNums("Jennie",20, 60);
		mRef.addNums("Jack",30, 70);
		mRef.addNums("Jim",40, 80);
		
		
		float result = mRef.calculateAreaOfCircle(2.2f);
		System.out.println("result is "+result);
		
		System.out.println("----------------");
		
		Methods.sayHelloAgain(); // Calling a Method or Executing a Method
		
		System.out.println("----------------");
		Methods.printTable(5);
		System.out.println("----------------");
		Methods.printTable(17);
	}

}
