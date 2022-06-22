package fileOps;

import java.io.File;

public class Ex2 {

	public static void main(String args[]) { //arguments--->old
		for (int i = 0; i<args.length; i++)
		{
		File f = new File("c:\\demo", args[i]);
		File f1 = new File("c:\\demo\\newfile");
		if (f.exists())
		{
		System.out.println(f +" does exists.");
		f.renameTo(f1);
		System.out.println("file renamed to : "+f1);
		f.delete();
		}
		else
		System.out.println(f +" does not exists");
		}

	}

}
