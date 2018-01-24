package com.auribises;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Hello"; // Interned Way
		String str2 = new String("Hello"); // Object Way

		// Strings are IMMUTABLE. Strings cannot be changed
		
		String str3 = str1.toUpperCase();
		String str4 = str2.toUpperCase();
		
		String str5 = str1.concat(", This is John");
		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println("str4: "+str4);
		System.out.println("str5: "+str5);
		
		String names = "John, Jennie, Jack, Jim, John, Joe";
		String quote = "Search THE candle rather than cursing the darkness";
		
		int l1 = names.length();
		System.out.println("l1 is: "+l1);
		
		char ch = names.charAt(0);
		System.out.println(ch);
		
		String s1 = names.substring(5);
		String s2 = names.substring(0,5);
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		
		String nmArr[] = names.split(",");
		/*for(int i=0;i<nmArr.length;i++){
			System.out.println(nmArr[i]);
		}*/
		
		for(String s : nmArr){
			System.out.println(s.trim());
		}
		
		System.out.println("--------------");
		
		String qtArr[] = quote.split(" ");
		int count = 0;
		for(String s : qtArr){
			
			/*if(s.compareTo("the")==0){
				count++;
			}*/
			
			/*if(s.equals("the")){
				count++;
			}*/
			
			if(s.equalsIgnoreCase("the")){
				count++;
			}
			
			System.out.println(s);
		}
		
		System.out.println("the occurs "+count+" times");
		
		String names1 = "John, Jennie, Jack, Jim, John, Joe.mp3";
		if(names1.contains("John")){
			System.out.println("John is in the list");
		}
		
		if(names1.endsWith("mp3")){ //names1.startsWith("mp3")
			System.out.println("names1 is a music file");
		}
		
		//int idx = names1.indexOf('o');
		//int idx = names1.lastIndexOf('o');
		//int idx = names1.indexOf("John");		
		int idx = names1.lastIndexOf("John");
		int l2 = names1.length();
		System.out.println(l2);
		System.out.println(idx);
		
		// MUTABLE Strings
		
		// Not Thread Safe
		StringBuilder builder = new StringBuilder("Hello"); // Mutable
		
		// Thread Safe
		StringBuffer buffer = new StringBuffer("Hello"); // Mutable
		
		//StringBuffer sb = "Hello"; err
		
		String str = new String("Hello"); // Immutable
		
		builder.append(", This is John");
		buffer.append(", This is Jack");
		str.concat(", This is Jennie");
		
		System.out.println("*******************");
		
		System.out.println("builder: "+builder);
		System.out.println("buffer: "+buffer);
		System.out.println("str: "+str);
		
		// Run Time Polymorphism
		CharSequence cs;
		cs = new String("hello");
		cs = new StringBuffer("hello");
		cs = new StringBuilder("hello");
		
		Object o;
		o = new String("hello");
		o = new StringBuffer("hello");
		o = new StringBuilder("hello");
	}

}
