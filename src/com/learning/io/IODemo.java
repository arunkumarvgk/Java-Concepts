package com.learning.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	private static String inputFile = "C://Users//arunkven//Downloads//APIParser.txt";
	private static String inputFile2 = "C://Users//arunkven//Downloads//Bhagavad Geetha.jpg";
	private static String outputFile = "C://Users//arunkven//Downloads//fileio//APIParser.txt";
	
	public static void fileMethodsDemo(){
		System.out.println("Inside file demo");
		File f= new File("C://Users//arunkven//Downloads//Bhagavad Geetha.jpg");
		System.out.println("Absolute Path :"+f.getAbsolutePath());
		try {
			System.out.println("getCanonicalPath Path :"+f.getCanonicalPath());
			System.out.println("Absolute Path :"+f.getParent()+" "+f.isFile()+" "+f.isDirectory()+" "+f.getAbsoluteFile()+" "+f.getParentFile()+" "+f.getCanonicalFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void fileCopyWithoutBuffer() {
		System.out.println("Without Buffer");

		int readByte = 0;
		long startTime, endTime;
		/*
		 * int readByte2 = 0;
		 * 
		 * try (FileInputStream in = new FileInputStream(inputFile);
		 * FileInputStream in2 = new FileInputStream(inputFile2);
		 * FileOutputStream out = new FileOutputStream(outputFile)) {
		 * 
		 * while (((readByte = in.read()) != -1) || ((readByte2 = in2.read()) !=
		 * -1)) { if(readByte!=-1){ out.write(readByte); } if(readByte2!=-1){
		 * out.write(readByte2); }
		 * 
		 * }
		 * 
		 * }
		 */

		try (FileInputStream in = new FileInputStream(inputFile);
				FileOutputStream out = new FileOutputStream(outputFile)) {

			startTime = System.nanoTime();
			while (((readByte = in.read()) != -1)) {
				if (readByte != -1) {
					out.write(readByte);
				}
			}
			endTime = System.nanoTime() - startTime;
			System.out.println("Timetaken :: " + endTime / 1000000000.0 + " secs");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("-------------------------------------------------------------");
			System.out.println(e.getLocalizedMessage() + " -> -> " + e.getMessage());
			System.out.println(e.getCause().getMessage() + " Causeeeeeeeeeeeeee");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("-------------------------------------------------------------");
			System.out.println(e.getLocalizedMessage() + " -> -> " + e.getMessage());
			System.out.println(e.getCause().getMessage() + " Causeeeeeeeeeeeeee");
		}
	}

	public static void fileCopyWithBuffer() {
		System.out.println("With Buffer");

		int readByte = 0;
		long startTime, endTime;

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inputFile));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFile))) {

			startTime = System.nanoTime();
			while (((readByte = in.read()) != -1)) {
				if (readByte != -1) {
					out.write(readByte);
				}
			}
			endTime = System.nanoTime() - startTime;
			System.out.println("Timetaken :: " + endTime / 1000000000.0 + " secs");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("-------------------------------------------------------------");
			System.out.println(e.getLocalizedMessage() + " -> -> " + e.getMessage());
			System.out.println(e.getCause().getMessage() + " Causeeeeeeeeeeeeee");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("-------------------------------------------------------------");
			System.out.println(e.getLocalizedMessage() + " -> -> " + e.getMessage());
			System.out.println(e.getCause().getMessage() + " Causeeeeeeeeeeeeee");
		}
	}

	public static void main(String[] args) {
		/*fileCopyWithoutBuffer();
		fileCopyWithBuffer();*/
		fileMethodsDemo();
		
	}

}
