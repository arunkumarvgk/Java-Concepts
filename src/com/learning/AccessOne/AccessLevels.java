package com.learning.AccessOne;

public class AccessLevels {
	public int public_val=100;
	private int private_val=200;
	int default_val=300;
	protected int protected_val=400;
	
	protected void hello(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		AccessLevels ac= new AccessLevels();
		System.out.println("Public Value "+ac.public_val);
		System.out.println("private Value "+ac.private_val);
		System.out.println("Default Value "+ac.default_val);
		System.out.println("Protected Value "+ac.protected_val);
		
	}
}

