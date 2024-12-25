package Seri_deseri;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


//De-serialization=
//here we read the content as binary(0's & 1's) from the file and form the object back.

//public class deserail {
//public static void main(String[] args) {
//	try {
//		FileInputStream fis= new FileInputStream("G:\\hello\\file.ser");
//		A a1 = new A();
//		ObjectInputStream ois= new ObjectInputStream(fis);
//		A obj = (A)ois.readObject();
//		System.out.println(obj.username);
//		System.out.println(obj.password);
//	} catch (Exception e) {
//		throw new RuntimeException(e);
//	}
//}
//}

//transient keyword
//During Serialization if you want to skip any data to be return into object than mark the variable with transient keyword.


public class deserail {
public static void main(String[] args) {
	try {
		FileInputStream fis= new FileInputStream("G:\\hello\\file.ser");
		A a1 = new A();
		ObjectInputStream ois = new ObjectInputStream(fis);
		A o = (A)ois.readObject();
		System.out.println(o.username);
		System.out.println(o.password);
	} catch (Exception e) {
		throw new RuntimeException(e);
	}
}
}