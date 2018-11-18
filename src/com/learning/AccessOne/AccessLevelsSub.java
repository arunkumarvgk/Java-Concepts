package com.learning.AccessOne;

public class AccessLevelsSub extends AccessLevels{
	public static void main(String[] args) {
		AccessLevels ac= new AccessLevels();
		AccessLevelsSub aa= new AccessLevelsSub();
		System.out.println("Public Value "+ac.public_val);
		System.out.println("Public Value child ref "+aa.public_val);
		//Cant Access private in sub class same pkg
		//Can access via child ref also
		//System.out.println("private Value "+ac.private_val);
		System.out.println("Default Value "+ac.default_val);
		System.out.println("Protected Value "+ac.protected_val);
		System.out.println("Default Value child ref "+aa.default_val);
		System.out.println("Protected Value child ref "+aa.protected_val);
		
		
	}
}
