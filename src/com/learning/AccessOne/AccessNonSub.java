package com.learning.AccessOne;

public class AccessNonSub {
	private void main() {

	}

	public static void main(String args) {
		AccessLevels ac= new AccessLevels();
		System.out.println("Public Value "+ac.public_val);
		//Cant Access private in different non class same pkg
		//System.out.println("private Value "+ac.private_val);
		System.out.println("Default Value "+ac.default_val);
		System.out.println("Protected Value "+ac.protected_val);
	}
}
