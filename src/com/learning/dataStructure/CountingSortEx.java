package com.learning.dataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingSortEx {

	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String s[]= new String[100];
        
        StringTokenizer tok =null;
        int max=0;
        int index=0;
        for(int i=0;i<n;i++){
        	tok = new StringTokenizer(in.readLine());
        	index=Integer.parseInt(tok.nextToken());
        	if(index>max){
        		max=index;
        	}
        	s[index]=(s[index]!=null)?s[index]+","+tok.nextToken():tok.nextToken();
        }
        
        for(int i=0;i<=max;i++){
        	if(s[i]!=null){
        		String ss[]= s[i].split(",");
        		for(int j=0;j<ss.length;j++){
        			System.out.println(i+" "+ss[j]);
        		}
        		
        	}
        	
        }

	}

}
