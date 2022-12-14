package demo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutputStreamDemo {
public static void main(String[] args) {
	DataOutputStream stream = null;
	try {
		stream = new DataOutputStream(new FileOutputStream("dataio"));
		stream.writeInt(10);
		stream.writeFloat(90.23f);
		stream.writeBoolean(true);
		stream.writeChar('A');
		System.out.println("data written in the file");
	} catch (IOException e) {
				e.printStackTrace();
	} finally {
		if (stream!=null) {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
}
