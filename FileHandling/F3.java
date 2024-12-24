package FileHandling;

import java.io.File;
import java.io.FileReader;

//FileReader()

//public class F3 {
//public static void main(String[] args) {
//	try {
//		File f = new File("G:\\hello\\A.txt"); 
//		FileReader fr = new FileReader(f);
//		for(int i=0;i<f.length();i++ ) {
//			System.out.print((char)fr.read());//read() utility method
//		}
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	
//}
//}

//Other way to reading data.
//with array

public class F3{
	public static void main(String[] args) {
		try {
			File f = new File("G:\\hello\\A.txt");
			FileReader fr = new FileReader(f);
			char []ch= new char[(int)f.length()];
			fr.read(ch);//this method change char to int
			for(char c :ch) {
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


