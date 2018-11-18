package com.learning.overloading;

public class OverLoading {
	
	public void add(){
		
	}
	
	public void add(int i){
		
	}
	public static void main(String[] args) {
		OverLoading a= new OverLoading();
		a.add();
		a.add(1);
	}

}
