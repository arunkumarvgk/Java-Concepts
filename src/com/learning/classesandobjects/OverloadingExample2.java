package com.learning.classesandobjects;

public class OverloadingExample2 {
	private int rollNum=-1234132413;
	
	char h='a';/// internally h will hae the ascii value of character 'a'
	
	OverloadingExample2(){
		System.out.println("Hello");
	}

	OverloadingExample2(int rnum) {
		this();
		rollNum = rollNum + rnum;
		//this(); //Error :: Constructor call must be the first statement in a constructor
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public static void main(String args[]) {
		OverloadingExample2 obj = new OverloadingExample2(12);
		System.out.println(obj.getRollNum());
	}
}
