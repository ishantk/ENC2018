package com.auribises.querysession2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	transient int salary;
	String name;
}

public class FileIO {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("");
			//FileReader reader = new FileReader(file);
			//BufferedReader buffer = new BufferedReader(reader);
			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Employee e = new Employee();
			e.id = 101;
			e.name = "John";
			e.salary = 50000;
			
			oos.writeObject(e);
			
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee eRef = (Employee)ois.readObject();
			
			
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		

	}

}
