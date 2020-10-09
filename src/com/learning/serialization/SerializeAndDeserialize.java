package com.learning.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class SerializeAndDeserialize {

	public static void main(String[] args) {
		final Test t = new Test("Hello", new Date(), 897);
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("file.ser")));
			out.writeObject(t);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Writing done now Reading.....");
		
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("file.ser")));
			final Test tt = (Test) in.readObject();
			in.close();
			System.out.println(tt.getName()+" "+tt.getDate().toString()+" "+tt.getNum());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class Test implements Serializable {
	private static final Long serialVersionUID = 1L;

	private final String name;
	private final Date date;
	private final transient int num;
	
	public Test(String name, Date date, int num) {
		super();
		this.name = name;
		this.date = date;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public int getNum() {
		return num;
	}

}
