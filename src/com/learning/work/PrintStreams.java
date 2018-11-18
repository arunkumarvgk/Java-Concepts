package com.learning.work;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreams {

	public static void main(String[] args) throws IOException {
		 FileOutputStream fout=new FileOutputStream("C://Users//arunkven//Desktop//nf//ps.txt ");    
		   PrintStream pout=new PrintStream(fout);    
		   pout.println(2016);    
		   pout.println("Hello Java");    
		   pout.println("Welcome to Java");    
		   pout.close();    
		   fout.close();    
		  System.out.println("Success?");    
	}

}
