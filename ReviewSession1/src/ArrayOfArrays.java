
public class ArrayOfArrays {

	public static void main(String[] args) {
		
		int[] a1 = {10,20,30,40,50};
		
		int[][] a2 = {
						{10,20,30,40,50},
						{10,20,30},
						{10,20,30,40},
						{10,20},
						{10}
					 };

		System.out.println(a1.length);
		System.out.println(a2.length);
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a2[0]); // address
		System.out.println(a2[0].length); // 5
		
		System.out.println(a2[1]); // address
		System.out.println(a2[1].length); // 3
		
		System.out.println(a2[3][1]);
		
		
		for(int i=0;i<a2.length;i++){
			for(int j=0;j<a2[i].length;j++){
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}
		
		int[][][] a3 = {
				
							{
								{10,20,30,40,50},
								{10,20,30},
								{10,20,30,40},
								{10,20},
								{10}
							 },
							 {
								{10,20,30,40,50},
								{10,20,30},
								{10,20,30,40},
								{10,20},
								{10}
							 }
				
					};
		
		System.out.println(a3);
		System.out.println(a3.length);
		
		System.out.println(a3[0]);
		System.out.println(a3[0].length);
		
		System.out.println(a3[0][0]);
		System.out.println(a3[0][0].length);
		
		System.out.println(a3[0][1][2]);	
		
		
		int[] arr = {10,20,30,40,50};
		int[] arr1 = arr; // Reference Copy
	}

}
