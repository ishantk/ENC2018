package com.auribises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Fun{
	void fun(){
		System.out.println("This is fun");
	}
}

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		//HashMap map = new HashMap();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "John");
		map.put(123, "Jennie");
		map.put(900, "Jack");
		map.put(311, "Jim");
		map.put(87, "Joe");
		
		map.put(123, "Fionna"); // Update Operation
		
		System.out.println(map);
		
		String name = map.get(900);
		System.out.println(name);
		
		System.out.println(map.size());
		
		if(map.containsKey(101))
			System.out.println("101 exists");
		
		if(map.containsValue("Fionna"))
			System.out.println("Fionna Exists");
		
		map.remove(87);
		
		map.put(null, "George");
		map.put(null, "Harry");
		
		map.put(767, null);
		
		map.put(563, null);
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println("Key is: "+key+" Value is: "+value);
		}
		
		//Object oRef = null;
		// int i = null; error
		//Integer i = null;
		
		//Fun fRef = null;
		//fRef.fun();
		
		// Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(123, "Jennie");
		table.put(900, "Jack");
		table.put(311, "Jim");
		table.put(87, "Joe");
		//table.put(null, "Fionna");
		//table.put(562, null);
		System.out.println(table);
	}

}
