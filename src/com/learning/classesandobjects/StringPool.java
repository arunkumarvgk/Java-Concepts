package com.learning.classesandobjects;

public class StringPool {

	public static void main(String[] args) {
		String a= "hello";
		
		String a2 = new String("hello");
		String a3 = new String("hello");
		
		System.out.println(" Memory Location of literal 'hello' in String Pool : "+System.identityHashCode(a));
		System.out.println(" Memory Location of object a2 in heap : "+System.identityHashCode(a2));
		System.out.println(" Value of String Object a2 in heap ie.. the memory location of hello in string pool : "+System.identityHashCode(a2.intern()));
		System.out.println(" Memory Location of object a3 l : "+System.identityHashCode(a3));
		System.out.println(" Value of String Object a3 in heap ie.. the memory location of hello in string pool : "+System.identityHashCode(a3.intern()));
		
		 String s1 = "Good";
		 String s2 = " Morning";
		String good="Good Morning!";
		
		String s = s1 + s2 + "!";
		// if s1 and s2 are final then stored in string pool as string literal else heap as object
		System.out.println(+System.identityHashCode(good)+"========="+System.identityHashCode(s));
		System.out.println(good == s);
		
		
	}

}
