package com.learning.Abstract;

public class ConcreteSubClass2 extends AbstractSuperClass{

	public static void main(String[] args) {
		ConcreteSubClass2 con= new ConcreteSubClass2();
		con.test1();
		con.test2();
	}

	@Override
	void test1() {
		System.out.println("Test1 in Con SC 2");
		
	}

	@Override
	void test2() {
		System.out.println("Test2 in Con SC 2");		
	}

}
