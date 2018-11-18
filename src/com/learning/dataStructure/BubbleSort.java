package com.learning.dataStructure;

public class BubbleSort {
	
	public static void bubblesort(int[] array){
		 boolean isSorted=false;
		 int k=0;
		 int lastunsorted=array.length-1;
		 while(!isSorted){
			 isSorted=true;
			 
			 for(int i=0;i<lastunsorted;i++){
				 System.out.println(++k);
				 if(array[i]>array[i+1]){
					 array[i]=array[i]+array[i+1];
					 array[i+1]=array[i]-array[i+1];
					 array[i]=array[i]-array[i+1];
					 isSorted=false;
				 }
				 lastunsorted--;
			 }
		 }
	}
	
	public static void main(String[] args) {
		//int arr[]={43,65,12,4,78,23};
		int arr[]={1,2,3,4,5};//
		bubblesort(arr);
		for(int val:arr){
			System.out.print(val+" ");
		}
	}

}
