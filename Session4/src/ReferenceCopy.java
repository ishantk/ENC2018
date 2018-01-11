
public class ReferenceCopy {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a; // Value Copy
		
		int[]c = {10,20,30};
		int[]d = c; // Reference Copy
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		System.out.println("c is: "+c);
		System.out.println("d is: "+d);
		
		d[1] = 100;
		System.out.println(c[1]);
		
		System.out.println();
		
		for(int e : c){
			System.out.println(e);
		}

	}

}
