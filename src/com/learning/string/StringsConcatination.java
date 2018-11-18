package com.learning.string;

public class StringsConcatination {

	public static void main(String[] args) {
		 String a="Hello";
		 String b="World";
		
		String s;
		String s2;
		s="a"+"b"+"c";
		
		s=a+"c";
		s2="a".concat("b").concat("c");
		s2=s2.concat("c");
		
		StringBuilder sb= new StringBuilder();
		sb.append(a).append(b).toString();
		
		String s4;
		for (int i=0;i<2;i++){
			s4=a+b;
		}
	}

}
