package fileOps;

import java.io.File;

public class Ex1 {

	public static void main(String[] args) {
		File f=new File("C:\\javaprog\\msf.txt");
		boolean result;
		try {
			result=f.createNewFile();
			if(result) {
				System.out.println("File exists");
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(f.getAbsolutePath());
		
	}

}
