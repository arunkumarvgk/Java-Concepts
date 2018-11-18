package com.learning.staticFinalEtc;

public class FinalExample {
	public final  int x=10;
	static{
		System.out.println("Hello static");
	}
	
	{
		System.out.println("Hello instance");
	}
	public static void main(String[] args) {
		FinalExample a= new FinalExample();
		int k=a.x;
		FinalExample a1= new FinalExample();
	}

}
