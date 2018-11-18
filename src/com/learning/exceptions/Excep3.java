package com.learning.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excep3 {
	public static void main(String[] args) {
		System.out.println("\nInside main ...");
		int i;
		try(FileOutputStream out = new FileOutputStream("hello.txt")) {

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 

		System.out.println("\nEnd of main ...");
	}

	private static void share() throws FileNotFoundException {
		System.out.println("\nInside share ...");

		HttpConnect.send(0, "hello", "http://www.goodsnips.com");

		System.out.println("\nEnd of share ...");
	}
}
