package com.learning.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DOS {

	public static void main(String[] args) {
		try(DataOutputStream data = new DataOutputStream( new FileOutputStream("C://Users//arunkven//Desktop//nf//dos.txt"))){
			data.writeLong(123123213213123213l);
			data.writeInt(1033000300);
			data.writeByte(256333333);
			data.writeShort(25888888);
		}catch(IOException e){
			
		}
	}

}
