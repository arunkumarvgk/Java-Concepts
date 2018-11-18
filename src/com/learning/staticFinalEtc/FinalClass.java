package com.learning.staticFinalEtc;

public class FinalClass {
	final int j;
	
	
	FinalClass(){
		j=20;
	}
	
	{
		//j=10;
	}
	
	public static void main(String[] args) {
		
		class HJH{
			int i;
			int j;
		}
		
		final HJH h= new HJH();
		
		//h= new HJH(); //no new initialization
		//but can change value of i
		h.i=19;
		h.i=10;
		
		
		final int i=10;
		//i++; cannot change
		
		final int[] a= new int[]{1,2};
		System.out.println(a.length);
		
		a[1]=10;// can change contents but not 
		
		//a=new int[10]; cannot do
			
	}
}
class CV{
	public static void main(String[] args) {
		FinalClass f= new FinalClass();
		System.out.println(f.j);
	}
}