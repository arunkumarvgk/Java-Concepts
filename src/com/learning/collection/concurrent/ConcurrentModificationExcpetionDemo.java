package com.learning.collection.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExcpetionDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer value = it.next();
			it.remove();
			
			System.out.println("List Value:" + value);
			if (value.equals(3))
				/* Expected mod count in iterator will different from mod count in list after execution of below line
				 * next time when next() is called it checks EMC == MC and thorws CME*/
				list.remove(value);
		}
	}

}
