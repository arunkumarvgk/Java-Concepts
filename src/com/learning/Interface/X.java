package com.learning.Interface;

public class X extends AbstractA implements A,B{

	@Override
	public void foo() {
		System.out.println("Foo in concerte class "+B.i);		
	}

}
