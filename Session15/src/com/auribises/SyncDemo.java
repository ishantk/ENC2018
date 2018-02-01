package com.auribises;

class Table{
	//void printTable(int num){
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		
	}
}

class MyThread extends Thread{
	
	Table q;
	
	MyThread(Table p){
		q = p;
	}
	
	public void run(){
		
		// Object Level Locking
		synchronized (q) {
			q.printTable(5);
			q.fun();
		}
		
		// Class Level Locking
		/*synchronized (Table.class) {
			
		}*/
		
	}
}

class YourThread extends Thread{
	
	Table q;
	
	YourThread(Table p){
		q = p;
	}
	
	public void run(){
		synchronized (q) {
			
			//System.out.println(Thread.currentThread().getState());
			
			/*if(Thread.currentThread().getState() == Thread.State.NEW){
				
			}*/
			
			q.printTable(7);
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");

		Table t = new Table();
		
		MyThread mRef = new MyThread(t); 
		YourThread yRef = new YourThread(t);
		
		System.out.println(Thread.currentThread().getState());
		
		mRef.start();
		yRef.start();
		
		// States of a Thread
		//Thread.State.NEW
		
		System.out.println("Main Finished");
	}

}
