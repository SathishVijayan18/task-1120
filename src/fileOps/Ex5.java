package fileOps;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter message here : ");
		String str=s.nextLine();
		char[] array=new char[100];
		try {
			Writer output=new FileWriter("C:\\javaprog\\java\\demo2.txt");
			output.write(str);
			output.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Reader input=new FileReader("C:\\javaprog\\java\\demo2.txt");
			System.out.println(input.ready());
			input.read(array);
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
