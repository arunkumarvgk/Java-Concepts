package com.learning.JVM;

public class ObjectRef {
	
	int i=10;
	ObjectRef(){
		i=99;
	}
	
	public void incI(ObjectRef or){
		incI(10);// can ref without object creation
		or.i=76;
	}
	
	public void incI(int k){
		k=76;
	}
	
	public static void main(String[] args) {
		ObjectRef o=new ObjectRef();
		System.out.println(o.i);
		o.incI(o);
		System.out.println(o.i);
		int k=10;
		System.out.println(k);
		o.incI(k);
		System.out.println(k);
		
	}

}
