public class Arrays {

	public static void main(String[] args) {
		
		System.out.println("Hello Wolrd");
		
		// a is a single value container | primitive type
		int a = 10;
		//a = 100;
		//int b = 10,20; error

		// Array -> multi value container | reference type
		int[] c = {10,20,30,40,50};
		
		System.out.println("a is: "+a+"\n");
		System.out.println("c is: "+c);
		
		// Write Elements of an Array
		c[3] = 10000;
		
		// Read Elements of an Array
		System.out.println("c[0] is: "+c[0]);
		System.out.println("c[3] is: "+c[3]);
		
		// Read All
		for(int i=4;i>=0;i--){
			System.out.print(c[i]+"  ");
		}
		
		System.out.println();
		
		System.out.println("Length of c is: "+c.length);
		
		// Enhanced For Loop | For-Each Loop
		for(int elm : c){
			System.out.print(elm+"  ");
		}
		System.out.println();
		
		// Syntaxes to create Arrays
		//1.
		int[] a1 = {10,20,30,40,50}; // Implicit Statement
		int a2[] = {10,20,30,40,50};
		
		//2.
		int[] a3 = new int[]{10,20,30,40,50}; // Explicit Statement
		int a4[] = new int[]{10,20,30,40,50}; // Explicit Statement
		
		//3. 
		int[] a5 = new int[7];
		
		System.out.println("a5 data");
		
		a5[0] = 10;
		a5[4] = 90;
		
		// Enhanced For Loop | For-Each Loop
		for(int elm : a5){
			System.out.print(elm+"  ");
		}
		System.out.println();
		
		System.out.println("a1 is: "+a1+" and length is: "+a1.length);
		System.out.println("a2 is: "+a2+" and length is: "+a2.length);
		System.out.println("a3 is: "+a3+" and length is: "+a3.length);
		System.out.println("a4 is: "+a4+" and length is: "+a4.length);
		System.out.println("a5 is: "+a5+" and length is: "+a5.length);
		
		//4.
		int[] a6;
		a6 = new int[5];
		
		int[] a7,a8,a9;
		a9 = new int[3];
		
		int a10[],a11[],a12;
		
		a10 = new int[7];
		a12 = 100;
		
				
	}

}
