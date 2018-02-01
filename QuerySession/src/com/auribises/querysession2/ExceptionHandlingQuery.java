package com.auribises.querysession2;

import java.io.IOException;

class ThrowThrows{
	
	// Throwing an UnChecked Exception
	void throwMe(){
		ArrayIndexOutOfBoundsException ae = new ArrayIndexOutOfBoundsException("This is Awsome");
		throw ae;
	}

	// Throwing an Checked Exception
	void throwMore() throws IOException{
		IOException io = new IOException("This is Awesome");
		throw io;
	}
}

public class ExceptionHandlingQuery {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int arr[] = {10,20,30,40,50};
		
		/*try{
			System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException aeRef){
			System.out.println("Some Error: "+aeRef);
		}*/

		ThrowThrows tRef = new ThrowThrows();
		tRef.throwMe();
		
		try {
			tRef.throwMore();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Finished");
	}

}
