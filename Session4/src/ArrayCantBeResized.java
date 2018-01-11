
public class ArrayCantBeResized {

	public static void main(String[] args) {
		
		int[] a1 = {10,20,30,40,50};
		
		//...
		
		// error
		//a1 = {10,20,30,40,50,60,70,80,90,100};
		
		int[] a2;
		a2 = new int[5];
		a2[0] = 10;
		a2[1] = 20;
		a2[2] = 30;
		a2[3] = 40;
		a2[4] = 50;
		
		System.out.println("a2 is: "+a2);
		for(int e : a2){
			System.out.print(e+"  ");
		}
		System.out.println();
		
		//...
		
		a2 = new int[10];
		System.out.println("a2 is: "+a2);
		for(int e : a2){
			System.out.print(e+"  ");
		}
		System.out.println();

		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[10];
		
		
		/*arr2[0] = arr1[0];
		arr2[1] = arr1[1];
		arr2[2] = arr1[2];*/
		
		/*for(int i=0;i<3;i++){
			arr2[i] = arr1[i];
		}*/
		
		// API | Application Programming Interfaces
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for(int e : arr2){
			System.out.print(e+"  ");
		}
		System.out.println();
		
		
	}

}
