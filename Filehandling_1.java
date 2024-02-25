package java_1;

import java.io.File;

//createNewFile()- it will create new file if file is not present in given path and will return true .
//if file is exists then return false.

//import java.io.File;
//import java.io.IOException;
//
//public class FIlehandling_1 {
//
//	public static void main(String[] args) {
//		File f = new File("G://hello//B.txt");
//		try {
//			boolean val = f.createNewFile();
//			System.out.println(val);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}

//mkdir()-it will create new folder is folder is not present in given path and it will return true.
//if folder exists return false

//public class FIlehandling_1{
//	public static void main(String[] args) {
//		File f = new File("G://hello//p2");
//		boolean val = f.mkdir();
//		System.out.println(val);
//	}
//}

//delete p2 folder
public class FIlehandling_1{
	public static void main(String[] args) {
		File f = new File("G://hello//p2");
		boolean val = f.delete();
		System.out.println(val);
	}
}