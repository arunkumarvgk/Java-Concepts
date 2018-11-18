package com.learning.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize1 implements Serializable {

	private String name;
	
	public static int staticdata;
	
	private transient String tname ="Helllo";
	
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void serializeObj(Serialize1 s) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C://Users//arunkven//Downloads//object1.ser")))) {
			staticdata++;
			out.writeObject(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserializeObj(){
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("C://Users//arunkven//Downloads//obje.ser")))){
			try {
				Serialize1 s=(Serialize1)in.readObject();
				System.out.println(s.getName());
				System.out.println(staticdata);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Serialize1 s = new Serialize1();
		s.setName("Asde");
		s.setTname("Transient name");
		serializeObj(s);
		//deserializeObj();
	}

}
