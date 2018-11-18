package com.learning.Interface.defaultMethod2;

public interface A {
	String hello();
	
	default String defaultMethod(){
		return "defaultMethod";
	}
	
	 static double defaultStaticMethod(double i){
		return Math.pow(i, 2);
	}
}
