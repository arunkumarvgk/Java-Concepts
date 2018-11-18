package com.learning.methodbinding.confuse;

public class B extends A{
	int i=2;
	static int k=18;
	
	B(){
		j=100;
		l=25;
	}
	public static String staticGO(){
		
		return "Static Class B";
	}
	
	public String instanceGO(){
		return "Instance Class B";
	}
	
	public String go(int i){
		
		return " Class B";
	}
	
	public void go1(int d){
		System.out.println("Class B go1");
	}

	
}
