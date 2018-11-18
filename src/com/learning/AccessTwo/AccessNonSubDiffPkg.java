package com.learning.AccessTwo;

import com.learning.AccessOne.AccessLevels;

public class AccessNonSubDiffPkg {
	public static void main(String[] args) {
		AccessLevels ac = new AccessLevels();
		AccessNonSubDiffPkg aa= new AccessNonSubDiffPkg();
		System.out.println("Public Value " + ac.public_val);
		//Cant Access any thing except public in class diff pkg
		//System.out.println("private Value "+ac.private_val);
		//System.out.println("Default Value " + ac.default_val);
		//System.out.println("Protected Value " + ac.protected_val);
		
	}
}
