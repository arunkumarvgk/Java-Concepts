package com.learning.collection.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockqueueDemo {
	private final static BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(5);

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					int i = 0;
					while (i++ != 10) {
						Thread.sleep(1000);
						System.out.println("Adding");
						bq.put(i);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						Thread.sleep(2000);
						if (bq.isEmpty()) {
							System.out.println("Waiting....");
						} else {
							System.out.println(bq.take());
						}
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t.start();
		t2.start();
	}
}
