
public class ArrayDemo {

	public static void main(String[] args) {
		
		// Single Value Containers
		int i = 10; // i is Value Type
		int j = 100;

		// Multi Value Containers
		// Array | Homogeneous (Same Type)
		int[] a1 = {10,20,30,40,50}; // a1 is Reference Type i.e. Reference Variable
		
		
		/*int ldhPop = 200;
		int jalPop = 500;
		int fzrPop = 270;
		int patPop = 450;
		int mgPop = 470;*/
		
		int[] punjabPop = {200,500,270,450,470,123,456,789,654};
		int[] himPop = {200,500,270,45};
		int[] upPop = {200,500,270,45,12,3567,1245,874,1223,123,678,677};
		
		System.out.println("i is: "+i);
		System.out.println("a1 is: "+a1);
		
		// Read the data from Array
		//System.out.println(a1[0]);
		//System.out.println(a1[2]);
		
		for(int idx=0;idx<5;idx++){
			System.out.println(a1[idx]);
		}
		
		
		System.out.println("Punjab Cities : "+punjabPop.length);
		
		int count = 0;
		
		for(int idx=0;idx<punjabPop.length;idx++){
			count = count + punjabPop[idx];
			System.out.println(idx+" : "+punjabPop[idx]);
		}
		
		System.out.println("Punjab with "+punjabPop.length+" Cities holds a population of "+count+" residents");
		
		// Syntaxes to Create Arrays
		//1. 
		int[] a2 = {10,20,30,40,50};
		//2. 
		int a3[] = {10,20,30,40,50};
		//3. 
		int[] a4 = new int[]{10,20,30,40,50};
		//4.
		int a5[] = new int[]{10,20,30,40,50};
		
		System.out.println("===============");
		
		a5[3] = 275;
		a5[4] = 500;
		
		for(i=0;i<a5.length;i++){
			System.out.println(a5[i]);
		}
		//5.
		int a6[] = new int[10];
		int[] a7 = new int[10];
		
		System.out.println("===============");
		
		a6[0] = 10;
		a6[9] = 100;
		
		/*for(i=0;i<a6.length;i++){
			System.out.println(a6[i]);
		}*/
		
		// Enhanced For Loop | For Each Loop
		for(int num : a6){
			System.out.println(num);
		}
		
		
		int x1[],x2[],x3;
		x1 = new int[2];
		x2 = new int[20];
		
		x3 = 100;
		
		int[] y1,y2,y3;
		y1 = new int[5];
		y2 = new int[50];
		y3 = new int[100];
		
		int[][] countryPop = {
				{200,500,270,450,470,123,456,789,654},
				{200,500,270,45},
				{200,500,270,45,12,3567,1245,874,1223,123,678,677},
				{200,500},
				{200,500,270,45,12,32}
		};
		
		int[][][] worldPop = {
								{
									{200,500,270,450,470,123,456,789,654},
									{200,500,270,45},
									{200,500,270,45,12,3567,1245,874,1223,123,678,677},
									{200,500},
									{200,500,270,45,12,32}
								},
								{
									{200,500,270,450,470,123,456,789,654},
									{200,500,270,45},
									{200,500,270,45,12,3567,1245,874,1223,123,678,677},
									{200,500},
									{200,500,270,45,12,32}
								}
			};
		
		System.out.println(countryPop);
		System.out.println(countryPop.length);
		
		System.out.println(countryPop[0]);
		System.out.println(countryPop[0].length);
		
		System.out.println(countryPop[0][3]);
		
		System.out.println("===============");
		
		count = 0;
		for(i=0;i<countryPop.length;i++){
			for(j=0;j<countryPop[i].length;j++){
				System.out.print(countryPop[i][j]+"  ");
				count = count + countryPop[i][j];
			}
			System.out.println();
		}
		System.out.println("Country's Population is: "+count);
		
		// 3 1d arrays, each having 5 elements
		int[][] arr1 = new int[3][5];
		
		// 3 1d arrays, elements for each array is not defined
		int[][] arr2 = new int[3][];
		arr2[0] = new int[5];
		arr2[1] = new int[15];
		arr2[2] = new int[25];
		
		char[][] engToHindi = {
								{'A','B','C'},
								{'\u0905','\u092c','\u0938'}
							 };
		for(i=0;i<engToHindi[0].length;i++){
			System.out.println(engToHindi[0][i]+" in hindi is "+engToHindi[1][i]);
		}
	}

}
