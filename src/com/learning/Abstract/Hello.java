package com.learning.Abstract;

public class Hello extends HH{
	public void hello1(){
		System.out.println("JJJK");
	}
	
	public static void main(String[] args) {
		HH a= new Hello();
		a.hello1();
	}
}

abstract class HH extends Hello2{
	public void hello1(){
		System.out.println("JJ");
	}
}

class Hello2 {
	
	
	public void hello1(){
		System.out.println("JKJ");
	}
}