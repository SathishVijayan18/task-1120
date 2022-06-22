package fileOps;

import java.io.File;

public class Ex3 {

	public static void main(String[] args) {
		File f=new File("C:\\javaprog\\java");
		boolean result=f.mkdir();
		if(result) {
			System.out.println(f.getAbsolutePath());
			System.out.println("created");
		}
		else {
			System.out.println("failed");
		}
	}

}
