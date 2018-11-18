package com.learning.classesandobjects;

public class MethodOverloading2 {

	public static void varagsOverload(int... j){
		System.out.println("int array");
	}
	
	public static void varagsOverload(int i,int j){
		System.out.println("int");
	}
	
	public static void varags(int... h){
		
	}
	public static void main(String[] args) {
		varagsOverload();
		varagsOverload(1);
		varagsOverload(1,2);
		varagsOverload(1,2,3);
	}

}
