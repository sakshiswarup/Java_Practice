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

//list()
//It will fetch all file names in the given path and return's String array.

public class F2{
	public static void main(String[] args) {
		File f = new File("G:\\hello\\");
		String []names=f.list() ;
		for(String name:names) {
			System.out.println(name);
			
		}
		System.out.println(names.length);//count no of files
	}
}
