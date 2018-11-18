package com.learning.classesandobjects;

public class BitwiseShift {
	public static String toBinary(int n) {
	       if (n == 0) {
	           return "0";
	       }
	       String binary = "";
	       while (n > 0) {
	           int rem = n % 2;
	           binary = rem + binary;
	           n = n / 2;
	       }
	       return binary;
	   }
	public static void main(String[] args) {
		
		int num= -20;
		int i = num >> 2;
		int j = num << 2;
		int k = num >>> 29;
		
		
		System.out.println("Number : "+ num +" => Binary "+toBinary(num)+" API "+Integer.toBinaryString(num));
		System.out.println("");
 		System.out.println("Right Shift : "+ num +" => After Shift "+i+" Binary Form "+toBinary(i)+" API "+Integer.toBinaryString(i));
		System.out.println("");
		System.out.println("Left Shift : "+ num +" => After Shift "+j+" Binary Form "+toBinary(j)+" API "+Integer.toBinaryString(j));
		System.out.println("");
		System.out.println("Unsigned Right Shift : "+ num +" => After Shift "+k+" Binary Form "+toBinary(k)+" API "+Integer.toBinaryString(k));
		
		System.out.println("==========================");
		System.out.println(Integer.toBinaryString((byte)-4));
		System.out.println(Integer.toBinaryString((short)-4));
		System.out.println(Integer.toBinaryString((int)-4));
		
		
		byte b = 10;
		final byte c = 11;
		final byte d = 12;
		 
		switch (b) {
		     case 127: break;
		     case c: break;
		     case d: break; 
		}
		
	}
}
