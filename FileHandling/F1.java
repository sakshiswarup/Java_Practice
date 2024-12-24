package FileHandling;

import java.io.File;

//public class F1 {
//public static void main(String[] args) {
//	File f= new File("G:\\hello\\A.txt");
//	System.out.println(f);
//}
//}

//exists()= it is non static method present inside file class.
// it will check whether the file is present in given path. if yes this will return true if not it will return false.
//public class F1{
//	public static void main(String[] args) {
//		File f = new File("G:\\hello\\A.txt");
//		boolean val = f.exists();
//		System.out.println(val);
//	}
//}

//delete()
//It will delete a file/folder in the given path.If file/folder is deleted it will return true .Otherwise false.
//public class F1{
//	public static void main(String[] args) {
//		File f = new File("G:\\hello\\A.txt");
//		boolean val = f.delete();
//		System.out.println(val);//true
//	}
//}

//mkdir()
//It will create a folder in the given path . If folder is created it will returned true, if not will return false.

//public class F1{
//	public static void main(String[] args) {
//		File f = new File("G:\\hello\\H");
//		boolean val = f.mkdir();
//		System.out.println(val);
//	}
//}

//length()
//Return type of this method is long value.
//It will count number of characters in the given file including Whitespaces.

public class F1{
	public static void main(String[] args) {
		File f = new File("G:\\hello\\B.txt");
		long val = f.length();
		System.out.println(val);
	}
}