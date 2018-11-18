package com.learning.dataStructure;

import java.util.Scanner;

public class CountInversion {
	
	private static long countInversions(int[] arr, int lo, int hi, int[] aux) {
		if (lo >= hi)
			return 0;

		int mid = lo+(hi - lo) / 2;

		long count = 0;
		count += countInversions(aux, lo, mid, arr);
		count += countInversions(aux, mid + 1, hi, arr);
		count += merge(arr, lo, mid, hi, aux);

		return count;
	}

	private static long merge(int[] arr, int lo, int mid, int hi, int[] aux) {
		long count = 0;
		int i = lo, j = mid + 1;
		int k = lo;
		while (i <= mid || j <= hi) {
			if (i > mid) {
				arr[k++] = aux[j++];
			} else if (j > hi) {
				arr[k++] = aux[i++];
			} else if (aux[i] <= aux[j]) {
				arr[k++] = aux[i++];
			} else {
				arr[k++] = aux[j++];
				count += mid + 1 - i;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int arr[] = {5,7,3,9};//,2,6,7,0,1,4};
		int[] aux = arr.clone();
		System.out.println(countInversions(arr, 0, arr.length - 1, aux));
		
		for(int i:arr){
			System.out.print(i+" ");
		}

	}
}
