package com.learning.multithreading;

public class JoinExample {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("First task started");
				System.out.println("Sleeping for 2 seconds");
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("First task completed");
			}
		});
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Second task completed");
			}
		});
		t.start(); // Line 15
		t.join(5000); // Line 16
		t1.start();
	}
}
