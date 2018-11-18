package com.learning.staticFinalEtc;

public class WrapperClasses {
	
	public static String toBin(int num){
		StringBuilder sb= new StringBuilder();
		while(num>=2){
			if((num%2)==0){
				sb.append(0);
				num=num/2;
			}else{
				sb.append(1);
				num=num/2;
			}
		}
		
		if(num==1){
			sb.append(1);
		}
		
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		int n=-132123;
		String s= Integer.toBinaryString(n);
		System.out.println(s);
		System.out.println(toBin(n)+" Mine");
	}

}
