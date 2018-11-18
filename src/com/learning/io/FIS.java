package com.learning.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {
	
	public static void readSinglechar(){
		try(FileInputStream in = new FileInputStream("C://Users//arunkven//Desktop//nf//fos.txt")){
			System.out.println((char)in.read());
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}
	}
	
	public static void readFull(){
		try(FileInputStream in = new FileInputStream("C://Users//arunkven//Desktop//nf//dos.txt")){
			int c;
			while((c=in.read())!=-1){
				System.out.print(c+"====="+(char)c);			
			}
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}
	}
	
	public static void readByte(){
		byte b[]= new byte[123];
		
		for(byte bb:b){
			System.out.print((char)bb);
		}
		
		try(FileInputStream in = new FileInputStream("C://Users//arunkven//Desktop//nf//fos.txt")){
			System.out.println("");
			System.out.println("++++++++++++++");
			System.out.println("Size: "+in.read(b));
			System.out.println("++++++++++++++");
			for(byte bb:b){
				System.out.print((char)bb);
			}
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}
	}
	
	public static void main(String[] args) {
		//readSinglechar();
		readFull();
		//readByte();
	}

}
