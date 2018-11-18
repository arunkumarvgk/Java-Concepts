package com.learning.dataStructure;

public class RadixSort {

	private static void radixSort(int[] a, int n, int place) {
		int i=0;
		int freq[]=new int[10];
		int output[]= new int[n];
		
		for(i=0;i<n;i++){
			freq[(a[i]/place)%10]++;
		}
		
		for(i=1;i<10;i++){
			freq[i]+=freq[i-1];
		}
		
		for(i=n-1;i>=0;i--){
			output[freq[(a[i]/place)%10]-1]=a[i];
			freq[(a[i]/place)%10]--;
		}
		
		for(i=0;i<n;i++){
			a[i]=output[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int a[] = { 170,45,75,90,802,24,2,66 };
		int n = a.length;
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		int place = 1;

		while (max != 0) {
			radixSort(a, n, place);
			place *= 10;
			max /= 10;
		}

	}

}
