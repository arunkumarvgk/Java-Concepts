package com.learning.work;

import java.util.Scanner;

public class AppleOrangePblm {

	public static int[] fruitsOnSamHouse(int[] apples,int[] oranges,int[] appleRangeReq,int[] orangeRangeReq){
		int appleCount=0;
		int orangeCount=0;
		
		for(int apple:apples){
			if(apple>=appleRangeReq[0] && apple<=appleRangeReq[1]){
				appleCount++;
			}
		}
		
		for(int orange:oranges){
			if(orange>=orangeRangeReq[0] && orange<=orangeRangeReq[1]){
				orangeCount++;
			}
		}
		
		return new int[]{appleCount,orangeCount};
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] samHouse= new int[2];
		samHouse[0]=in.nextInt();
		samHouse[1]=in.nextInt();
		
		int appleTreePos=in.nextInt();
		int orangeTreePos=in.nextInt();
		
		int[] noOfApples;
		noOfApples=new int[in.nextInt()];
		

		int[] noOfOranges;
		noOfOranges=new int[in.nextInt()];
		
		for(int i=0;i<noOfApples.length;i++){
			noOfApples[i]=in.nextInt();
		}
		
		for(int i=0;i<noOfOranges.length;i++){
			noOfOranges[i]=in.nextInt();
		}
		
		
		System.out.println("sam house from "+samHouse[0]+" to "+samHouse[1]);
		System.out.println("apple tree at "+appleTreePos+" orange tree at "+orangeTreePos);
		System.out.println("no of apples "+noOfApples.length+" no of oranges "+noOfOranges.length);
		System.out.println("Apples distance ");
		for(int i=0;i<noOfApples.length;i++){
			System.out.println(noOfApples[i]);
		}
		System.out.println("oranges distance ");
		for(int i=0;i<noOfOranges.length;i++){
			System.out.println(noOfOranges[i]);
		}
		
		int applesRangeDistance[]=new int[2];
		applesRangeDistance[0]=samHouse[0]-appleTreePos;
		applesRangeDistance[1]=samHouse[1]-appleTreePos;
		
		int orangesRangeRequired[]= new int[2];
		orangesRangeRequired[0]=samHouse[0]-orangeTreePos;
		orangesRangeRequired[1]=samHouse[1]-orangeTreePos;
		
		int result[]= new int[2];
		result=fruitsOnSamHouse(noOfApples,noOfOranges,applesRangeDistance,orangesRangeRequired);
		System.out.println("no of Apples on sam hous "+result[0]);
		System.out.println("no of oranges on sam hous "+result[1]);
		
	}

}
