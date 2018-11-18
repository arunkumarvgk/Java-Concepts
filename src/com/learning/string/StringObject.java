package com.learning.string;

import com.learning.string2.*;

public class StringObject {
	
	@Override
	public String toString(){
		return "k";
	}
	
	public static void main(String[] args) {
		String s=new String();
		
		System.out.println(s.hashCode());
		com.learning.string2.StringObject.addToString(s);
		System.out.println(s);
	}

}
