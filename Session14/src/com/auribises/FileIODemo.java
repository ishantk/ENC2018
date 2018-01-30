package com.auribises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIODemo {
	
	/*void writeInFile(){
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/enc2018.txt");
			File file = new File("/Users/ishantkumar/Downloads/myProg.java");
			FileOutputStream fos = new FileOutputStream(file,true); //true -> Append Mode
			//String str = "Search the Candle, rather than cursing the darkness!!";
			String str = "class MyProg{\n\n\tpublic static void main(String[] args)\n\n\t}\n\n}";
			fos.write(str.getBytes());
			fos.close();
			System.out.println("Data Written...");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}*/
	
	void writeInFile(){
		try {
			
			
			File file = new File("/Users/ishantkumar/Downloads/YourProg.java");
			FileWriter writer = new FileWriter(file,true); //true -> Append Mode
			
			String str = "class YourProg{\n\n\tpublic static void main(String[] args){\n\n\t}\n\n}";
			
			writer.write(str);
			
			writer.close();
			
			System.out.println("Java Program with "+file.getName()+ " created ");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	/*void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/YourProg.java");
			FileInputStream fis = new FileInputStream(file);
			
			int ch = 0;
			while((ch = fis.read()) != -1){
				System.out.print((char)ch);
			}

			fis.close();
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}*/
	
	void readFromFile(){
		try {
			
			int count = 0;
			
			File file = new File("/Users/ishantkumar/Downloads/FileIODemo.java");
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			
			while((line = buffer.readLine()) != null){
				System.out.println(line);
				
				if(line.contains("new"))
					count++;
			}
				
			System.out.println("Objects Created: "+count);
			
			buffer.close();
			reader.close();
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}


	public static void main(String[] args) {
		
		FileIODemo fRef = new FileIODemo();
		//fRef.writeInFile();
		fRef.readFromFile();
	}

}
