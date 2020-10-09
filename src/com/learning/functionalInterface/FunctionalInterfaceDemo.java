package com.learning.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceDemo {

	public void biConsumer(int a, int b) {
		final BiConsumer<Integer, Integer> bicon = (a1, b1) -> System.out.println(a1+b1);
		bicon.accept(a, b);
	}

	private void consumer(int a) {
		final Consumer<Integer> consumer = (a1) -> System.out.println(a*a);
		consumer.accept(a);
	}
	
	private String intToString(Function<Integer, String> function, int value) {
		return function.apply(value);
	}

	private Integer perform(Function<Integer, Integer> function, int value) {
		return function.apply(value);
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo test = new FunctionalInterfaceDemo();
		test.biConsumer(10,  20);
		test.consumer(20);
		System.out.println(test.intToString((a) -> a.toString(), 10));
		
		// Square
		System.out.println(test.perform((a) -> a * a, 10));
		
		// Cube
		System.out.println(test.perform((a) -> a * a * a, 10));
	}

}
