package com.learning.dataStructure;

import java.util.Scanner;

public class BubbleSort2 {
	
	public static int bubblesort(int[] array){
		boolean isSorted=false;
		int lastUnsorted=array.length-1;
		int noOfSwaps=0;
		while(!isSorted){
			isSorted=true;
			
			for(int i=0;i<lastUnsorted;i++){
				if(array[i]>array[i+1]){
					array[i]=array[i]+array[i+1];
					array[i+1]=array[i]-array[i+1];
					array[i]=array[i]-array[i+1];
					isSorted=false;
					noOfSwaps++;
				}
			}
			lastUnsorted--;
		}
		return noOfSwaps;
	}
	
	public static int bubbleSortSwaps(int arr[]){
        int swaps=0; 
        boolean isSorted=false;
        int lastUnsorted=arr.length-1;
        while(!isSorted){
            isSorted=true;
            for(int i=0;i<lastUnsorted;i++){
				if(arr[i]>arr[i+1]){
					arr[i]=arr[i]+arr[i+1];
					arr[i+1]=arr[i]-arr[i+1];
					arr[i]=arr[i]-arr[i+1];
                    swaps++;
                    isSorted=false;
                }
            }
            lastUnsorted--;
        }
        return swaps;
    }
	
	public static void main(String[] args) {
		int size;
		
		Scanner sn= new Scanner(System.in);
		
		System.out.println("Enter Size :");
		size=sn.nextInt();
		System.out.println("Enter "+size+" values");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++){
			arr[i]=sn.nextInt();
		}
		
		System.out.println("Array entered");
		System.out.println("");
		for(int val:arr){
			System.out.print(val+" ");
		}
		System.out.println("");
		System.out.println("Array is sorted in "+bubblesort(arr)+" swaps.");
		System.out.println("First Element: "+arr[0]);
		System.out.println("Last Element: "+arr[size-1]);
		System.out.println("Array sorted");
		System.out.println("");
		for(int val:arr){
			System.out.print(val+" ");
		}
		
		System.out.println();
	}

}
