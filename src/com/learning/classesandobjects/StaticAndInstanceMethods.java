package com.learning.classesandobjects;

public class StaticAndInstanceMethods {

	public static int i=10;
	public int j=8;
	
	public static void inc(StaticAndInstanceMethods s){
		System.out.println(s.getImulJ());
		System.out.println(s.j);
		i++;
	}
	
	public int getImulJ(){
		return i*j; 
	}
	public static void main(String[] args) {
		
		StaticAndInstanceMethods s= new StaticAndInstanceMethods();
		
		StaticAndInstanceMethods.inc(s);
	}

}
