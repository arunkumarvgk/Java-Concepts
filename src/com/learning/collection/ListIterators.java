package com.learning.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		ListIterator i= list.listIterator();
		
		while(i.hasNext()){
			//System.out.println(i.next());
			//System.out.println(i.previous());
			i.remove();
			//i.set(103);
			//i.set(10);
			System.out.println("--"+list);
			//i.add(123);
			System.out.println(list);
		}
		System.out.println(list);
		
	}

}
