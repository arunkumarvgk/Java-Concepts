package com.learning.classesandobjects;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder SB= new StringBuilder();
		
		SB.append("Hello How are \"you ");
		System.out.println(SB.toString());
		
		SB.delete(0, 2);
		System.out.println(SB.toString());
		
		System.out.println(SB.insert(0,"Helllll"));

	}

}
