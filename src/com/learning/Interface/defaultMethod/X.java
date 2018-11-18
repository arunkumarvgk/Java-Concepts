package com.learning.Interface.defaultMethod;

public class X extends AbstractA implements A,B,C{

	@Override
	public void foo() {
		System.out.println("Foo in concerte class "+B.i);		
	}

	@Override
	public void fooBar() {
		System.out.println("Foo Bar C interface");		
	}

}
