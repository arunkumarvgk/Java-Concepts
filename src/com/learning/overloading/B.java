package com.learning.overloading;

public class B extends A{
	
	B(){
		//super(10);
		System.out.println("B Class B()");
		
	}
	
	B(int i){
		
		this();
		//super();
		System.out.println("B int");
	}
	
	B(float f){
		super(10);
	}
	
	public final String Hello(){
		return "Jello";
	}
	
	public static void main(String[] args) {
		B s = new B(10);
	}

}
