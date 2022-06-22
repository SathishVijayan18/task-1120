package fileOps;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex4 {

	public static void main(String[] args) {
	String input="welcome to MSIL";
	try {
		OutputStream os=new FileOutputStream("C:\\javaprog\\java\\demo.txt");
		byte[] inputbytes=input.getBytes();
		os.write(inputbytes);
		System.out.println("success");
		os.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
