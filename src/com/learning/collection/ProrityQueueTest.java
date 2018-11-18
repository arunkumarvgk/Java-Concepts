package com.learning.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ProrityQueueTest {
	public static void main(String... args) {
		PriorityQueueComparator pqc = new PriorityQueueComparator();
		PriorityQueue<String> pq = new PriorityQueue<String>(5, pqc);
		pq.add("ABC");
		pq.add("BD");
		pq.add("ABCD");
		for (String s : pq) {
			System.out.println(s);
		}
	}
}

class PriorityQueueComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
}