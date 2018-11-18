package com.learning.classesandobjects;

public class MethodOverloading {
	
	int a,b;
	
	
	public static void add(byte a){
		System.out.println("byte");
	}
	
	public static void add(int a){
		System.out.println("int");
	}
	
	public static void add(short a){
		System.out.println("short");
	}
	
	public static void add(long a){
		System.out.println("long");
	}
	
	public static void main(String[] args) {
		add(12);
		add((int)12);
		add((byte)12);
		add((short)12);
		add((long)12);
		add(2132132);
	}

}
