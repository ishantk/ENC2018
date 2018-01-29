package com.auribises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// User Defined UnChecked Exception
class BankingException extends RuntimeException{
	BankingException(String msg){
		super(msg);
	}
}

// User Defined Checked Exception
class MyBankingException extends Exception{
	MyBankingException(String msg){
		super(msg);
	}
}

class Banking{
	
	int balance = 10000;
	int minBal = 3000;
	
	int attempts = 3;
	int count = 0;
	
	void withdraw(int amt){
		
		balance = balance - amt;
		
		if(balance<=minBal){
			count++;
			balance = balance+amt;
			System.out.println("Withdraw Failure. Balance is Low: \u20b9"+balance);
			
			if(count == attempts){
				//ArithmeticException ae = new ArithmeticException("Banking Error");
				//throw ae;
				
				BankingException be = new BankingException("ILLEGAL ATTEMPTS");
				throw be;
			}
			
		}else{
			System.out.println("Withdraw Done. Balance is: \u20b9"+balance);
		}
	}
	
	void withdrawAgain(int amt) throws IOException{
		
		balance = balance - amt;
		
		if(balance<=minBal){
			count++;
			balance = balance+amt;
			System.out.println("Withdraw Failure. Balance is Low: \u20b9"+balance);
			
			if(count == attempts){
				IOException io = new IOException("Illegal Attempts !!");
				throw io;
			}
			
		}else{
			System.out.println("Withdraw Done. Balance is: \u20b9"+balance);
		}
		
		
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Banking App Started");
		
		Banking bRef = new Banking();
		
		/*for(int i=0;i<1000;i++){
			bRef.withdraw(3000);
		}*/
		
		try {
			bRef.withdrawAgain(3000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("Banking App Finished");
	}

}
