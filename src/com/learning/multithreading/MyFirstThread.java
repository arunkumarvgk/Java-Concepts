package com.learning.multithreading;

public class MyFirstThread {

	public static void main(String[] args) {
		Task task= new Task();
		Thread thread = new Thread(task);  //New State
		
		thread.start();// Runnable State
		
		System.out.println("Inside main");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Inside main");
		System.out.println("Inside main");
		System.out.println("Inside main");
		
	}

}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		go();
	}

	private void go() {
		System.out.println("Inside method go");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		more();
	}

	private void more() {
		System.out.println("Inside method more");
	}

}
