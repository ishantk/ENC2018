package com.aurbises.client;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Name of Employee: ");
		String name = scanner.nextLine();

		System.out.println("Enter Age of Employee: ");
		int age = scanner.nextInt();
		
		System.out.println("Welcome, "+name+" You are "+age+" years old");
		
		scanner.close();
		

	}

}
