package com.learning.Interface;

public abstract class AbstractA implements A,B{
	public  void bar(){
		System.out.println("bar in abstract class "+A.i);
	}
}
