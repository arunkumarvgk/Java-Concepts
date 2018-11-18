package com.learning.classesandobjects;

public class PassByValueObjRef {
	int id;
	public static void main(String[] args) {
		PassByValueObjRef s= new PassByValueObjRef();
		s.id=1001;
		
		System.out.println("S before "+s.id);
		PassByValueObjRef s1= s;
		s1.id=2001;
		
		System.out.println("S after "+s.id);
		
		s.id=3001;
		
		System.out.println("S1 after "+s1.id);
		
		
	}

}
