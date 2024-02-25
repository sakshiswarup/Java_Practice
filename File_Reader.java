package java_1;

import java.io.File;
import java.io.FileReader;

//public class File_Reader {
//	public static void main(String[] args) {
//		try {
//			File f = new File("G://hello//A.txt");// also we can write(pathName:"G://hello//A.txt")
//			FileReader fr = new FileReader(f);
//
//			for (int i = 0; i < f.length(); i++) {
//				System.out.print((char) fr.read());
//			}
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//}

//or

public class File_Reader{
	public static void main(String[] args) {
		try {
			File f = new File("G://hello//A.txt");//(pathName:"G://hello//A.txt")
			FileReader fr = new FileReader(f);
			char[]ch=new char[(int)f.length()];
			fr.read(ch);
			for(char c:ch) {
				System.out.print(c);
			}
					} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
		
	
}
