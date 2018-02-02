package com.auribises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	int eid;
	String ename;

	public String toString() {
		return eid+" belongs to "+ename;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(); // RAW Type
		//List list2 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>(); // GENERIC Type
		ArrayList<Employee> list3 = new ArrayList<Employee>(); // GENERIC Type

		// Add Data to AxrrayList
		//list1.add(0,10); //0th index
		list1.add(10); //0th index  list1.add(new Integer(10)); 
		list1.add(10.2);
		list1.add('A');
		list1.add("John");
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.ename = "Jennie";
		list1.add(e1); // n-1 index
		
		
		list2.add("John"); //0
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Joe"); //n-1
		// list2.add(10); error
		
		Employee e2 = new Employee();
		e2.eid = 102;
		e2.ename = "Fionna";
		
		Employee e3 = new Employee();
		e3.eid = 103;
		e3.ename = "Harry";
		
		list3.add(e1);
		list3.add(e2);
		list3.add(e3);
		//list3.add(10);
		//list3.add("Hello");
		
		// Read the ArrayList
		System.out.println(list1);
		System.out.println("==============================");
		System.out.println(list2);
		System.out.println("==============================");
		System.out.println(list3);
		
		// Size
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		
		// Read Single Element
		System.out.println(list1.get(0));
		System.out.println(list2.get(1));
		System.out.println(list3.get(2));
		
		// Delete from list
		list2.remove(0);
		System.out.println(list2);
		System.out.println(list2.get(0));
		
		// Update into list
		list2.set(0, "Jennie Watson");
		System.out.println(list2);
		
		if(list2.contains("Jack"))
			System.out.println("Jack is in the list");
		
		// Read All
		//1. For Loop
		System.out.println("=============For Loop==============");
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		//2. Enhanced For Loop
		System.out.println("=============Enhanced For Loop==============");
		for(String elm : list2){
			System.out.println(elm);
		}
		System.out.println("=============Enhanced For Loop==============");
		for(Object elm : list1){
			System.out.println(elm);
		}
		System.out.println("=============Enhanced For Loop==============");
		for(Employee elm : list3){
			System.out.println(elm);
		}
		
		//3. Iterator
		System.out.println("=============Iterator==============");
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
			if(nm.equals("Jack")){
				itr.remove(); // removes the element from ArrayList
			}
		}
		System.out.println("=============Iterator==============");
		Iterator<Object> itr1 = list1.iterator();
		while(itr1.hasNext()){
			Object nm = itr1.next();
			System.out.println(nm);
		}
		
		//4. ListIterator
		System.out.println("=============ListIterator==============");
		ListIterator<String> itr3 = list2.listIterator();
		while(itr3.hasNext()){
			String nm = itr3.next();
			System.out.println(nm);
		}
		System.out.println("------------");
		while(itr3.hasPrevious()){
			String nm = itr3.previous();
			System.out.println(nm);
		}

		//5. Enumeration
		System.out.println("=============Enumeration==============");
		Enumeration<String> enmList = Collections.enumeration(list2);
		while(enmList.hasMoreElements()){
			String nm = enmList.nextElement();
			System.out.println(nm);
		}
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("George");
		names.add("Henry");
		names.add("Jim");
		names.add("Kim");
		
		list2.addAll(names);
		System.out.println(list2);
		
		//list2.clear();
		//System.out.println(list2);
		
		//if(list2.isEmpty())
		
		int idx = list2.indexOf("Jim");
		idx = list2.lastIndexOf("Jim");
		System.out.println(idx);
		
		// Thread-Safe
		Vector<String> vector = new Vector<String>();
		vector.add("George");
		vector.add("Henry");
		vector.add("Jim");
		vector.add("Kim");
	}

}
