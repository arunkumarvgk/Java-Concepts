package com.learning.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledES {
	public static  void main(String... args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService scheduledExecutorService =
		        Executors.newScheduledThreadPool(5);

		@SuppressWarnings("unchecked")
		ScheduledFuture<String> scheduledFuture =
		    scheduledExecutorService.schedule(new Callable<String>() {
		        public String call() throws Exception {
		            System.out.println("Executed!");
		            return "Called!";
		        }
		    },
		    2,
		    TimeUnit.SECONDS);

		ScheduledFuture scheduledFuture2 = scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
			        public void run() {
			            System.out.println("Executed!");
			        }
			    },
			    2,2,
			    TimeUnit.SECONDS);
		System.out.println(scheduledFuture2.isCancelled());
		//scheduledFuture2.cancel(true);
		System.out.println(scheduledFuture2.isCancelled());
		
	}
}
