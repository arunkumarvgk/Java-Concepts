package com.learning.collection;

import java.util.LinkedList;
import java.util.List;

public class LL {

	public static void main(String[] args) {
		List<Integer> ll= new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.print(ll.get(0));
		System.out.print(ll.get(1));
		System.out.print(ll.get(2));
		System.out.print(ll.get(3));
		System.out.println(ll.get(4));
		
		ll.remove(2);
		
		System.out.print(ll.get(0));
		System.out.print(ll.get(1));
		System.out.print(ll.get(2));
		System.out.print(ll.get(3));

	}

}
