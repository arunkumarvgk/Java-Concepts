package com.learning.staticFinalEtc;

public class InstanceInit {

	{
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("Instance initializer");
	}
	
	{
		System.out.println("Second Init");
	}
	InstanceInit() {
		System.out.println("Default");
	}

	InstanceInit(int k) {
		System.out.println("one");
	}

	InstanceInit(int k,int j) {
		System.out.println("two");
	}

	public static void main(String[] args) {
		InstanceInit a= new InstanceInit();
		InstanceInit aa= new InstanceInit(2);
		InstanceInit aaa= new InstanceInit(2,3);
	}

}
