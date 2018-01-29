package com.auribises;

public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("--App Started--");

		int[] arr = {10,20,30,40,50};
		int a=10,b=0,c=0;
		try{
			System.out.println(arr[0]);
			c = a/b;
			System.out.println(c);
		}catch(Exception e){
			//System.out.println("OOPS!! Exception Occurred !!");
			System.out.println("Exception is: "+e);
			//e.printStackTrace();
		}
		/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("OOPS!! ArrayIndexOutOfBoundsException Occurred !!");
		}catch(ArithmeticException aRef){
			System.out.println("OOPS!! ArithmeticException Occurred !!");
		}*/finally{
			System.out.println("This is Awesome");
		}
		
		
		
	
		
		System.out.println("--App Finished--");
	}

}
