package com.auribises;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/Quotes.txt");
			//File file = new File("/Users/ishantkumar/Downloads","Module6");
			File file = new File("/Users/ishantkumar/Downloads/abc.txt");
			//File file = new File("/Users/ishantkumar/Downloads","MyQuotes.txt");
			//File newFile = new File("/Users/ishantkumar/Downloads","MyQuotes.txt");
			
			
			
			if(file.exists()){
				if(file.isFile()){ // file.isDirectory()
					System.out.println(file.getName()+" file exists");
					
					//file.delete();
					//System.out.println(file.getName()+" Deleted...");
					//file.renameTo(newFile);
					//System.out.println(file.getName()+" File Renamed to "+newFile.getName());
				}else{
					System.out.println(file.getName()+" directory exists");
					
					/*String[] files = file.list();
					for(String s : files){
						//if(s.endsWith(""))
						System.out.println(s);
					}*/
					
					File[] files = file.listFiles();
					for(File f : files){
						if(f.isFile()){
							System.out.println(f.getName());
							System.out.println("----------------");
						}
					}
				}
			}else{
				System.out.println(file.getName()+" does not exists");
				//file.mkdir();
				//file.mkdirs();
				file.createNewFile();
				System.out.println(file.getName()+" Created...");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		

	}

}
