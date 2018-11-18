package com.learning.dataStructure;

public class InsertionSort {

	public static void insertionSort(int arr[]){
		int valueToBeInserted=0;
		int j=0;
		for(int i=1;i<arr.length;i++){
			valueToBeInserted=arr[i];
			j=i;
			while(j>0 && arr[j-1]>valueToBeInserted){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=valueToBeInserted;
		}
	}
	public static void main(String[] args) {
		int[] arr={10,16,18,4,12,11};
		insertionSort(arr);
		
		for(int val:arr){
			System.out.print(val+" ");
		}
	}

}
