package com.learning.classesandobjects;

public class ConstructorExample {
	public int i;
	public static int j;
	
	ConstructorExample(int j){
		i=10;
		this.j=j;
	}
	
	public void hello(){
		i++;
		j++;
		hello2(10);
	}
	
	public static void hello2(int k){
		//hello();
		//i++;
		j++;
	}
	
	public static void main(String[] args) {
		ConstructorExample a= new ConstructorExample(10);
	}

}
