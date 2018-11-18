package com.learning.classesandobjects;

public class SignleTon {
	int i;
	
	 SignleTon(){// Is this is private we can't extend this class
		
	}
}

class Single extends SignleTon{
	Single(){
		super();
	}
}
