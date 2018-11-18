package com.learning.Abstract;

public abstract class AbstractSubClass extends AbstractSuperClass{
	@Override
	void test1(){
		System.out.println("Test1 implemented in sub abstract class");
	}
	
	abstract void test3();
}
