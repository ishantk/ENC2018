package com.auribises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> set1 = new HashSet<String>();
		TreeSet<String> set1 = new TreeSet<String>();
		TreeSet<Employee> empSet = new TreeSet<Employee>(); // Comparator
		//Set<String> set2 = new HashSet<String>(); // Polymorphic Statement
		
		set1.add("John");
		set1.add("Jennie");
		set1.add("Jack");
		set1.add("Jennie");
		set1.add("Jim");
		set1.add("Joe");
		
		System.out.println(set1);

		
		if(set1.contains("John"))
			System.out.println("John is in the set");
		
		set1.remove("Jennie");
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
			
			

	}

}
