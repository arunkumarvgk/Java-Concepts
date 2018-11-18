package com.learning.AccessTwo;

import com.learning.AccessOne.AccessLevels;
import com.learning.AccessOne.AccessLevelsSub;

public class AccessSubDiffPkg extends AccessLevels{
	public static void main(String[] args) {
		AccessLevels ac = new AccessLevels();
		AccessSubDiffPkg aa = new AccessSubDiffPkg();
		System.out.println("Public Value " + ac.public_val);
		//Cant Access any thing except public in class diff pkg
		//System.out.println("private Value "+ac.private_val);
		//System.out.println("Default Value " + ac.default_val);
		//System.out.println("Protected Value " + ac.protected_val);
		System.out.println("Protected Value with child ref " + aa.protected_val);
		
		if(10==11)
			System.out.println("10");
		System.out.println("11");
		
	}
}
