package com.learning.work;

import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[]= new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
    
        for(int j=N-1;j>=0;j--){
            System.out.println(arr[j]);
        }
	}

}
