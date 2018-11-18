package com.learning.inheritance;

public class BB extends AA {

	@Override
	public void we() {
		System.out.println("BB 1");
	}

	@Override
	public void we1() {
		System.out.println("BB 2");
	}
	
	
	public void go(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();

		AA bbb = new BB();
		
		a.we();
		a.we1();
		
		b.we();
		b.we1();
		b.go(16);
		
		bbb.we();
		bbb.we1();
		bbb.go(12);
	}

}
