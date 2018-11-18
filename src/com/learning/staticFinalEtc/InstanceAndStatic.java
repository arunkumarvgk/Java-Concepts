package com.learning.staticFinalEtc;

public class InstanceAndStatic {
	
	static int i;
	int j;
	
	{
		j=0;
		System.out.println("no name");
	}
	
	static{
		i=0;
		System.out.println("Static ");
	}
	
	InstanceAndStatic(){
		j=0;
		System.out.println("no-arg Constructor");
	}
	
	InstanceAndStatic(int j){
		j=0;
		System.out.println("arg Constructor");
	}
	
	public static void sInc(){
		i++;
		//j++; Compiler error
		
		new InstanceAndStatic().j++;
	}
	
	public void iInc(){
		i++;
		j++;
	}
	
	public static void main(String[] args) {
		InstanceAndStatic s= new InstanceAndStatic();
		InstanceAndStatic s2= new InstanceAndStatic(1);
	}

}
