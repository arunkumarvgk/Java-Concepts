package com.learning.work;

public class Samplee {
	
	int i;
	
	public void incI(){
		i++;
	}
	
	public static void main(String[] args) {
		Samplee s1= new Samplee();
		Samplee s2= new Samplee();
		
		s1.i=8;
		s2.i=7;
		
		System.out.println(s1.i+" "+s2.i);
		s2.incI();
		System.out.println(s1.i+" "+s2.i);
	}

}
