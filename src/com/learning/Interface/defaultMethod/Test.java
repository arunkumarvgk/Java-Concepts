package com.learning.Interface.defaultMethod;

public class Test {
	
	public static int getVal(){
		return 42;
	}
	
	public  int getValIns(){
		return 42;
	}
	
	public static void main(String[] args) {
		A a= new X();
		
		a.bar();
		a.foo();
		
	}

}
