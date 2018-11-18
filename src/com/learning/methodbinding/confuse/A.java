package com.learning.methodbinding.confuse;

public class A {
	
	int i=14;
	static int k=14;
	
	int j=100;
	static int l=25;
			
	
	public static String staticGO(){
		return "Static Class A";
	}
	
	public String instanceGO(){
		return "Instance Class A";
	}
	
	public String go(double d){
		return " Class A";
	}
	
	public void go1(byte d){
		System.out.println("Class A go1");
	}
	
}
