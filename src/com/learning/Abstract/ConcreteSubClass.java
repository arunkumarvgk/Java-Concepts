package com.learning.Abstract;

public class ConcreteSubClass extends AbstractSubClass{

	@Override
	void test3() {
		System.out.println("Test3 in concrete class");
	}

	@Override
	void test2() {
		System.out.println("Test2 in concrete class");
	}
	
	public static void main(String[] args) {
		ConcreteSubClass con = new ConcreteSubClass();
		con.test1();
		con.test2();
		con.test3();
	}

}
