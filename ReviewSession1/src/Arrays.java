public class Arrays {

	public static void main(String[] args) {
		
		//int i = 10;
		//int j = 10,20; // error
		
		//k is a reference variable
		int[] k = {10,20,30,40,50};
		//System.out.println("i is: "+i);
		System.out.println("k is: "+k);

		char[] chArr = {'A','E','I','O','U'};
		
		float[] fArr = {2.2f,3.3f,1.2f};
		
		
		// Sytanxes
		//1
		int[] a1 = {10,20,30,40,50};
		//2
		int[] a2 = new int[]{10,20,30,40,50};
		//3
		int a3[] = {10,20,30,40,50};
		//4
		int a4[] = new int[]{10,20,30,40,50};
		//5
		int[] a5 = new int[5]; // Array with the Size, having all elements as 0
		
		// Write in Array
		a1[0] = 200;
		
		a5[0] = 1000;
		a5[3] = 7890;
		
		// Read the Array
		System.out.println(a1[0]);
		System.out.println(a5[0]);
		
		System.out.println(a1.length);
		
		System.out.println("--------------");
		// Read All - Array
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		System.out.println("--------------");
		for(int i=0;i<a5.length;i++){
			System.out.println(a5[i]);
		}
		
		System.out.println("--------------");
		// Enhanced For Loop | For Each Loop
		for(int elm : a5){
			System.out.println(elm);
		}
		
		
		int a6[],a7[],a8[];
		
		int[] a9,a10,a11;
		
		a6 = new int[5]; // all elements are 0
		
		a9 = new int[10]; // all elements are 0
		
	}

}
