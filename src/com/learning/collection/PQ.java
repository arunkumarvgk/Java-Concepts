package com.learning.collection;

import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(40);
		pq.add(90);
		pq.add(5);
		pq.add(1);
		pq.add(100);
		
		System.out.println(pq);

		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
		
	}

}
