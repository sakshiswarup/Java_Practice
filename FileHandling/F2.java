package FileHandling;

import java.io.File;

//CreateNewFile()
//it will create new file, if file is not present in the given path and will return true if the file exists then ,
//it will not create file by replacing existing file &hence will return type is false.

public class F2 {
public static void main(String[] args) {
	try {
		File f= new File("G:\\hello\\A.text");
		boolean val = f.createNewFile();
		System.out.println(val);//true

	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
