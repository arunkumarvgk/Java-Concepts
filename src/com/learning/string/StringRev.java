package com.learning.string;

public class StringRev {


	public static String reverse(char s[]){
		for(int i=0,j=s.length-1;i<=j;i++,j--){
			s[i] ^= s[j]; 
			s[i] ^= (s[j] ^= s[i]);
		}
		return s.toString();
	}
	
	public static void main(String[] args) {
		
		String s="Anil";
		s=reverse(s.toCharArray());
		System.out.println(s);
	}

}
