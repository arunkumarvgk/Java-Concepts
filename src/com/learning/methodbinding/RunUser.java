package com.learning.methodbinding;

public class RunUser {

	public static void main(String[] args) {
		User u = new Editor();
		//u.saveWebLink();
		 int a[];
		for(int i = 0; i < 3; i++) 
		{ 
		    switch(i) 
		    { 
		        case 0: break; 
		        case 1: System.out.print("one "); 
		        case 2: System.out.print("two "); 
		        case 3: System.out.print("three "); 
		    } 
		} 
		System.out.println("done");
	}

}
