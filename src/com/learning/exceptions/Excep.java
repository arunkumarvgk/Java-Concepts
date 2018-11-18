package com.learning.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Excep {
	
	public String hello(){
		FileOutputStream out= null;
		int i;
			try {
				return "Hello";
			} finally{
				System.out.println("J");
			}
			
	}
	
	public  int test(int i) {
        try {
            if (i == 0)
                throw new Exception("jj");
            return 0;
        } catch (Exception e) {
        	System.out.println(e.getMessage()+" ======");
            return 1;
        } finally {
            try{
            	int ii=10;
            }catch(Exception e){
            	e.getMessage();
            }finally{
            	try{
            		System.out.println("HJHJ");
            	}finally{
            		System.out.println("HJHJjj");
            	}
            }
        }
    }
	
	public static void main(String[] args) {
		Excep a= new Excep();
		System.out.println(a.test(0));
        System.out.println(a.test(1));
	}

}
