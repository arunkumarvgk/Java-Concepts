package com.learning.io;

import java.io.FileOutputStream;

public class FOS {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C://Users//arunkven//Desktop//nf//fos.txt");
			fout.write(16682);
			//fout.write(new byte[]{127,2});
			//fout.close();
			System.out.println("success...");
			
			String s="Welcome to javaTpoint.";  
            fout.write(s.getBytes());
            fout.close();    
            System.out.println("success...");    
            
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
