package com.learning.staticFinalEtc;

public class WrapperClassPerforance {

		
	public static void expensiveWrapper(){
		Long sum=0l;
		
		for (int i=0;i<Integer.MAX_VALUE;i++){
			sum+=i;
		}
	}
	
	public static void InexpensivePrimitiver(){
		long sum=0l;
		
		for (int i=0;i<Integer.MAX_VALUE;i++){
			sum+=i;
		}
	}
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		expensiveWrapper();
		System.out.println("Elapsed time "+((System.nanoTime()-start))/1000000.0+" msec");
		start = System.nanoTime();
		InexpensivePrimitiver();
		System.out.println("Elapsed time "+((System.nanoTime()-start))/1000000.0+" msec");
	}

}
