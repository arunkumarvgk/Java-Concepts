package com.learning.classesandobjects;

public class TypeCasting {

	public static void main(String[] args) {
		long l=123123123L;
		
		System.out.println(l+" long");
		
		int i = 300;
		
		System.out.println(i+" int");
		
		short s= (short)i;
		
		System.out.println(s+" short");
		
		byte b = (byte)i;
		
		System.out.println(b+" byte");
		
		int oldVal= 1234567890;
		float floati = oldVal;
		int newVal = (int)floati;
		
		System.out.println(oldVal+"--"+floati+"--"+newVal);
	}

}
