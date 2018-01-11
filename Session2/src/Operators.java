
public class Operators {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 3;
		
		int n3 = n1 % n2;
		System.out.println("n3 is: "+n3);
		
		// Increment by 1
		n1++;
		++n1;
		
		int n4 = ++n1;
		
		System.out.println("n1 is: "+n1); // 12 11
		System.out.println("n4 is: "+n4); // 12 11
		
		int n5 = 8;
		int n6 = 10;
		int n7 = n5 & n6;
		System.out.println("n7 is: "+n7);
		
		//int n8 = n5>>3; // divide by 2 pow 3
		int n8 = n5<<3; // multiple by 2 pow 3
		System.out.println(n8);
		
		int n9 = n8>>3;
		System.out.println(n9);

	}

}
