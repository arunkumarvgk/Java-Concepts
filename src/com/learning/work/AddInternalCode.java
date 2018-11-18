package com.learning.work;

public class AddInternalCode {

	public static void main(String[] args) {
		int a;
		int c=0,b=87609090;
		a= b^c;
		
		System.out.println(b+" "+c);
		
		b=b^c;
		c=b^c;
		b=b^c;
		
		System.out.println(b+" "+c);
	}
}
