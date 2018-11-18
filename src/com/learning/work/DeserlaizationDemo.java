package com.learning.work;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.learning.io.Serialize1;

public class DeserlaizationDemo {

	public static void main(String[] args) {
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("C://Users//arunkven//Downloads//object1.ser")))) {
			Serialize1 s = (Serialize1) in.readObject();
			System.out.println(s.getName()+" "+s.getTname()+" "+Serialize1.staticdata);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
