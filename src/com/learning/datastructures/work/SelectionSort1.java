package com.learning.datastructures.work;

public class SelectionSort1 {

	public static void main(String[] args) {
		int a[]= {30,20,40,10,50,70,90};
		
		int temp;
		for(int i=0;i<a.length-1;i++){
			
			int min_idx=i;
			
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min_idx]){
					min_idx=j;
				}
			}
			
			temp=a[min_idx];
			a[min_idx]=a[i];
			a[i]=temp;
			
			
		}
		
		for(int i=0;i<a.length-1;i++){
			System.out.println(a[i]);
		}
	}

}
