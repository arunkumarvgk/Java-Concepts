package com.learning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("i");
		list.add("j");
		list.add("k");
		list.add("l");
		list.add("m");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		list.forEach(System.out::print);
	}

}
