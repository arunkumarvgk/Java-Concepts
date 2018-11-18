package com.learning.work;

public class AppleShares {
	
	public static void getMaxProfit(int arr[]){
		int min=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]){
				min=i+1;
				arr[i]=arr[i]+arr[i+1];
				arr[i+1]=arr[i]-arr[i+1];
				arr[i]=arr[i]-arr[i+1];
			}
		}
		
		System.out.println(min);
	
	}
	
	public static void mulArrayOtherThenPresentIndex(int a[]){
		int aa[]= new int[a.length];
		int val=1;
		for(int i=0;i<a.length;i++){
			val=1;
			for(int j=0;j<a.length;j++){
				if(i!=j){
					val*=a[j];
				}
			}
			aa[i]=val;
		}
		
		for(int v:aa){
			System.out.print(v+" ");
		}
	}
	
	public static void mulArrayOtherThenPresentIndex2(int intArray[]){
		int[] productsOfAllIntsBeforeIndex = new int[intArray.length];

		// for each integer, find the product of all the integers
		// before it, storing the total product so far each time
		int productSoFar = 1;
		for (int i = 0; i < intArray.length; i++) {
		    productsOfAllIntsBeforeIndex[i] = productSoFar;
		    productSoFar *= intArray[i];
		}
		
		for(int v:productsOfAllIntsBeforeIndex){
			System.out.print(v+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] stockPricesYesterday = new int[] {10, 7, 5, 8, 11, 9};
		//getMaxProfit(stockPricesYesterday);
		mulArrayOtherThenPresentIndex2(new int[]{1,7,3,4});
	}

}
