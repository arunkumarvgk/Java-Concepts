package com.learning.work;

import java.util.Scanner;

public class Work2 {
	
	public static int absDiagonalDiff(int n, int[][] arr) {
	     int l=0;
	     int m=0;
	     System.out.println(n);
	     for(int i=0;i<n;i++){
	    	 l+=arr[i][i];
	    	 m+=arr[i][n-1-i];
	     }
	     
	     return Math.abs(l-m);
	}
	 
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
            	arr[i][j]=in.nextInt();
            }
        }
        int result = absDiagonalDiff(n, arr);
        System.out.println(result);*/
		
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        long arr[]=new long[N];
	        for(int i=0;i<N;i++){
	            arr[i]=Long.parseLong(s.next());
	        }
	        
	        for(long val:arr){
	        	System.out.println( (val <= 0 ) ? 0 : 
	        						((val<=3) ? 1 : 
	        							((val%3!=0) ? val : val/3)));
	        }
	        
	}

}
