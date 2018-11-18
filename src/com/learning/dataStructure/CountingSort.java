package com.learning.dataStructure;

public class CountingSort {
	
	static int aux[];
	
	public static void countingSort(int arr[]){
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++){
			 if(arr[i]>max){
				max=arr[i];
			}
		}
		
		aux= new  int[max+1];
		for(int i=0;i<arr.length;i++){
			aux[arr[i]]++;
		}
				
		int j=0;
		for(int i=0;i<aux.length;i++){
			int temp=aux[i];
			
			for(int l=0;l<temp;l++){
				arr[j]=i;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {6,8,2,4,1,6,3,2,54};
				
		countingSort(arr);
				
		for(int i=0;i<aux.length;i++){
			if(aux[i]!=0){
				System.out.println(i+" "+aux[i]);
			}
			
		}
	}

}
