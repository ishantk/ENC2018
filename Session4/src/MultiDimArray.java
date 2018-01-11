
public class MultiDimArray {

	public static void main(String[] args) {
		
		int[] punjabPopulation = {1000,250,900,100,670};
		int[] himachalPopulation = {250,900,100,670,123,450,123};
		
		int[][] indiaPopulation=		{
										{1000,250,900,100,670}, 
										{250,900,100,670,123,450,123}
								    };
		
		System.out.println("himachalPopulation is: "+himachalPopulation);
		System.out.println("himachalPopulation length is: "+himachalPopulation.length);
		
		// Array of Arrays
		int[][] arr = {
						{10,20,30}, //0
						{10,20,30,40,50}, //1
						{10,20}, //2
						{10,20,30,40}, //3
						{10} //4
					  };
		System.out.println("arr is: "+arr);
		System.out.println("arr length is: "+arr.length);
		
		System.out.println("arr[0] is: "+arr[0]);
		System.out.println("arr[0] length is: "+arr[0].length);
		
		System.out.println("arr[4] is: "+arr[4]);
		System.out.println("arr[4] length is: "+arr[4].length);
		
		System.out.println(arr[3][2]);
		
		System.out.println();
		System.out.println("--------------");
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("--------------");


		// Array of Array of Arrays
		int[][][] arr1 = {
							{
								{10,20,30}, //0
								{10,20,30,40,50}, //1
								{10,20}, //2
								{10,20,30,40}, //3
								{10} //4
						  	},
							{
								{10,20,30}, //0
								{10,20,30,40,50}, //1
								{10,20}, //2
								{10,20,30,40}, //3
								{10} //4
							}
						};
		
		System.out.println(arr1);
		System.out.println(arr1.length);
		
		System.out.println(arr1[0]);
		System.out.println(arr1[0].length);
		
		System.out.println(arr1[0][1]);
		System.out.println(arr1[0][1].length);
		
		System.out.println(arr1[0][1][2]);
		
		char[] chArrEng = {'A','B','C','D','E'};
		char[] chArrHindi = {'\u0905','\u092C','C','D','E'};
		
		System.out.println(chArrEng[0]+" in Hindi is "+chArrHindi[0]);
		System.out.println(chArrEng[1]+" in Hindi is "+chArrHindi[1]);
		
		String[] strArr = {"John","Jennie","Jim","Jack","Joe"};
		
		for(String s : strArr){
			System.out.println(s);
		}
		
		for(char ch : chArrEng){
			System.out.println(ch);
		}
		
		
		int[][] arr2 = new int[3][3];
		
		int[][] arr3 = new int[5][];
		//int[][] arr4 = new int[][8]; error
		
		arr3[0] = new int[1];
		arr3[1] = new int[10];
		arr3[2] = new int[5];
		arr3[3] = new int[50];
		arr3[4] = new int[15];
		
		arr3[0][0] = 10;
		
	}

}
