package com.learning.dataStructure;

import java.util.Scanner;

public class QuickSort {
	public static void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index-1) {
			quickSort(arr, left, index - 1);
		}
		if (right > index) {
			quickSort(arr, index, right);
		}
	}

	public static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int temp = 0;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}

	public static void main(String args[]) throws Exception {


		int arr[] = new int[]{3,5,2,8,1};


		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i]);
		}
	}
}
