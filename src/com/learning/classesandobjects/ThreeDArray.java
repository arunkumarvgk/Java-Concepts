package com.learning.classesandobjects;

public class ThreeDArray {

	public static void main(String[] args) {
		int a[][][]=new int[2][2][4];
		
		// above says we have 2 2D array's with 2 rows and  columns in both
		
		for(int i=0;i<a.length;i++){
			System.out.println("=======");
			for(int j=0;j<a[i].length;j++){
				for(int k=0;k<a[i][j].length;k++){
					System.out.print(i+j+k+" ");
				}
				System.out.println("");
			}
		}

	}

}
