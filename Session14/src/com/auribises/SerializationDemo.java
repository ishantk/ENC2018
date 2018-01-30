package com.auribises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	// Attributes
	transient int roll;
	String name;
	
	Student(){
		roll = 0;
		name = "NA";
	}
	
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	void showStudent(){
		System.out.println(roll+" belongs to "+name);
	}
}

public class SerializationDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		
		String data = s1.roll+" - "+s1.name;
		//s1.showStudent();
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/students.dat");
			
			// SERIALIZATION
			/*FileOutputStream fos = new FileOutputStream(file,true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			System.out.println("Object Saved in "+file.getName());
			oos.close();
			fos.close();*/
			
			// DESERIALIZATION
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student sRef = (Student)ois.readObject();
			sRef.showStudent();
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
		
		
		

	}

}
