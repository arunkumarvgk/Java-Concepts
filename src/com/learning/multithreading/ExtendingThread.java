package com.learning.multithreading;

public class ExtendingThread extends Thread{
	
	public void run(){
		System.out.println("Inside Run");
		go();
	}
	
	public void go(){
		System.out.println("Inside go");
		more();
	}
	
	public void more(){
		System.out.println("Inside more");
	}
	
	public static void main(String[] args) {
		ExtendingThread thread = new ExtendingThread();
		thread.start();
		System.out.println("Main ");
	}

}
