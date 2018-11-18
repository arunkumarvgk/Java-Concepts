package com.learning.dataStructure;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]={-7,64,-56,43,-96,26,34,97,56,25,-9000};
		//String arr[]={"Anil","abishek","Sunil","Mahesh","Bibis"};
		int min_index=0;
		for(int i=0;i<arr.length-1;i++){
			min_index=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min_index]){
					min_index=j;
				}
			}
			
			if(min_index!=i){
				arr[i]=arr[i]^arr[min_index];
				arr[min_index]=arr[i]^arr[min_index];
				arr[i]=arr[i]^arr[min_index];
			}
			
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}

}
