package com.learning.collection.concurrent;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
	private static final ConcurrentMap<Integer, Integer> cmap = new ConcurrentHashMap<>();

	public static void main(String[] args) throws FileNotFoundException {
		for (int i = 0; i < 1000; i++) {
			cmap.put(i, i);
		}
		
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(cmap.get(i));
		}
		
		try (PrintStream stream = new PrintStream("hello.txt")) {
			stream.println("Hello world!");
			}
	}

}
