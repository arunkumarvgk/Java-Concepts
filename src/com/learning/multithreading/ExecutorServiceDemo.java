package com.learning.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService e = Executors.newCachedThreadPool();

		
		Future<String> f=e.submit(new Runnn());
		System.out.println(f.get());
		e.submit(new Runn());
		e.shutdown();
	}

}

class Runnn implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("Callable");
		return "I am done";
	}
	
}
class Runn implements Runnable{

	@Override
	public void run() {
		System.out.println("I am running");
	}
	
}
