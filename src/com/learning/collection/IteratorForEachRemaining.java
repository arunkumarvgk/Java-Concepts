package com.learning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorForEachRemaining {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		list.add("i");
		list.add("j");
		list.add("k");
		list.add("l");
		list.add(null);
		
		
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String val=itr.next();
			if(val!=null && val.equals("j")){
				itr.remove();
				itr.forEachRemaining((elem)->{
					System.out.println("for remaining element "+elem+" we say hello");
				});
			}
			System.out.println("jjjjjjjjjjjj");
		}
		
		
		
		System.out.println("---------API method---------");
		list.forEach(System.out::print);
		
		System.out.println("");
		
		System.out.println("---------Pass method---------");
		list.forEach(Filter::filter);
		
		System.out.println("---------Consmer---------");
		list.forEach(new Filter2());
	}

}

