package com.learning.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exceptionsdemo1 {
	
	public static void main(String[] args)   {	
		System.out.println("\nInside main ...");	
		FileOutputStream out= null;
		int i;
		try {
			
			//i=10/0;
			out = new FileOutputStream("C://Users//arunkven//Desktop//Java IMP.txt");
			System.out.println(10/0+" kkkk");
			share();
			return;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Hello FINALLY");
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		System.out.println("\nEnd of main ...");
	}

	private static void share() throws FileNotFoundException {
		System.out.println("\nInside share ...");
		
		HttpConnect.send(0, "hello", "http://www.goodsnips.com");
			
		
		System.out.println("\nEnd of share ...");
	}	
	 
}
