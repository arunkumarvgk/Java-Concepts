package com.learning.classesandobjects;

public class MemoryAddress {
	
	int i=10;
	String a="a";
	
	
	public static void main(String[] args) {
		Integer j=109;
		
		MemoryAddress  m= new MemoryAddress();
		
		System.out.println(Integer.toHexString(m.hashCode()));
		System.out.println(Integer.toHexString(j.hashCode()));
		System.out.println(Integer.toHexString(System.identityHashCode(m)));

	}

}
