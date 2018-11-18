package com.learning.dataStructure;

public class MergeSort {
	
	static int jk=0;
	static int kj=0;
	static int ak=0;
	static int count=0;
	public static void merge(int A[], int start, int mid, int end) {
		// stores the starting position of both parts in temporary variables.
		int p = start, q = mid + 1;

		int Arr[] = new int[end - start + 1];
		int k = 0;

		for (int i = start; i <= end; i++) {
			if (p > mid) // checks if first part comes to an end or not .
				Arr[k++] = A[q++];

			else if (q > end) // checks if second part comes to an end or not
				Arr[k++] = A[p++];

			else if (A[p] < A[q]) // checks which part has smaller element.
				Arr[k++] = A[p++];

			else{
				Arr[k++] = A[q++];
			}
		}
		for (int h = 0; h < k; h++) {
			A[start++] = Arr[h];
		}
	}
	
	public static void merge_sort(int A[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(A, start, mid);
			merge_sort(A, mid + 1, end);
			merge(A, start, mid, end);
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		//int arr[] = { 6,5,4,3,2,1,0,-1,-2,-3,-4 };
		//int arr[] = { 1,2,3,4,5,6,7,8,9,10,11,12,13};
		int arr[]={2,1,3,1,2};
		System.out.println("Given Array");
		printArray(arr);

		merge_sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
		
	}

}
