package com.learning.work;


public class BinSe {

	public static int binSearch(int arr[], int search) {
		int newArr[]=null;
		int i = (arr.length / 2);
		System.out.println(arr.length);
		
		if (arr[i] == search) {
			System.out.println(arr[i] +" == "+search+" -> "+i);
			return i;
		}
		
		if(arr[i]>search){
			newArr = new int[i-1];
			System.arraycopy(arr, 0, newArr, 0, i-1);
			binSearch(newArr,23);
		}else{
			int k=arr.length-(i+1);
			System.out.println(k);
			newArr = new int[k];
			System.arraycopy(arr, i+1, newArr, 0, k);
			binSearch(newArr,23);
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 23, 36, 56, 78, 90 };
		System.out.println(binSearch(arr, 23));
	}

}
