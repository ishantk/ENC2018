package com.auribises;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		//Queue<Integer> pq = new PriorityQueue<Integer>()
		
		for(int i=10;i>0;i--){
			pq.add(i);
		}
		
		/*System.out.println(pq.peek()); // Head of Queue
		
		System.out.println(pq.poll()); // Remove and give back the head
		
		System.out.println(pq.peek()); // Head of Queue*/
		
//		System.out.println(pq.size()); // 10
//		
//		System.out.println(pq.poll()); // remove head
//		
//		System.out.println(pq.size()); // 9
		
		for(int i=0;i<10;i++){
			System.out.println(pq.poll());
		}

	}

}
