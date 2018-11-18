package com.learning.dataStructure;

public class BubbleSort1 {

	public static void main(String[] args) {
		int arr[]={-7,64,-56,43,-96,26,34,97,56,25};
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<(arr.length-i)-1;j++){
				if(arr[j]>arr[j+1]){
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
			
			for(int k=0;k<arr.length;k++){
				System.out.print("  "+arr[k]);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
