package com.learning.Abstract;


abstract class AbClass{
	
	//int i;
	
	//static int j;
	
	static{
		//System.out.println("Static");
		 //j=10;
	 }
	
	{
		System.out.println("initializers");
	}

	AbClass(){
		System.out.println("cons");
		//i=100;
	}
	 
	
	
	void printHello(){
		System.out.println("Hello !");
	}
}

public  class Ab2 extends AbClass{

	public static void main(String[] args) {
		//AbClass a= new Ab2();
		AbClass ab2= new Ab2();
		/*ab2.printHello();
		System.out.println(ab2.i);*/
	}

}
