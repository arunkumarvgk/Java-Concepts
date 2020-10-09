package com.learning.overloading;

public class A {
	A(){
		System.out.println("A class A()");
	}
	
	A(int i){
		System.out.println("int A");
	}
	
	public String Hello(){
		return "Jello";
	}
}
