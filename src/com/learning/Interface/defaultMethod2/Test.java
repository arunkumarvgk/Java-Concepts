package com.learning.Interface.defaultMethod2;

public class Test implements B{

	@Override
	public String hello() {
		return "hello";
	}

	@Override
	public String hello2() {
		return "hello2";
	}
	
	@Override
	public String defaultMethod(){
		return "defaultMethod 2";
	}
	
	public static void main(String[] args) {
		B b= new Test();
		
		System.out.println(b.hello());
		System.out.println(b.hello2());
		System.out.println(b.defaultMethod());
		System.out.println(A.defaultStaticMethod((double)10));
	}

	

}
