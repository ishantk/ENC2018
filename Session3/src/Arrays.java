
public class Arrays {

	public static void main(String[] args) {
		
		// Prmitive Type
		int i = 10;
		// int j = 10,20; // error
		
		// Reference Type
		int[] k = {10,20,30,40,50}; // S1 // Implicit
		int l[] = {10,20,30,40,50}; // S2
		
		int[] a1 = new int[]{10,20,30,40,50}; // S3 // Explicit
		int a2[] = new int[]{10,20,30,40,50}; // S3 // Explicit
		//int a3[] = new int[5]{10,20,30,40,50}; // error cannot give size
		
		int m = i; // Value Copy
		int[] n = k; // Reference Copy
		System.out.println("i is: "+i);
		System.out.println("m is: "+m);
		System.out.println("k is: "+k);
		System.out.println("l is: "+l);
		System.out.println("n is: "+n);
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		// Read the Array
		System.out.println(k[0]);
		System.out.println(k[4]);
		
		System.out.println("-------------");
		int length = k.length;
		System.out.println("ks length is: "+length);
		
		/*for(int idx=0;idx<length;idx++){
			System.out.println(k[idx]);
		}*/
		
		// Enhanced For Loop | For-Each Loop
		for(int e : k){
			System.out.println(e);
		}

	}

}
