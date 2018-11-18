package com.learning.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class LinkedList1 {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.add(1);
		deque.addFirst(2);
		deque.add(3);
		deque.addFirst(null);
		
		
		System.out.println(deque);
		
		Random rand = new Random();
		 for (int i=0;i<10;i++){
			 System.out.println(rand.nextInt());
		 }
	}

}
