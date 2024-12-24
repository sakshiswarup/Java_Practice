package FileHandling;

import java.io.FileWriter;

//FileWriter()
public class F4 {
public static void main(String[] args) {
	try {
		FileWriter fw = new FileWriter("G:\\hello\\A.txt",true); //here append:true it means earlier data is there.
		//FileWriter fw = new FileWriter("G:\\hello\\A.txt",false);//here append is false so it means earlier data gone replace with new file
		fw.write(97); //it will change int to char
		fw.write("mike");
		fw.write("100");
		fw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
//other method

public class F4{
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("G:\\hello\\A.txt",false);
			char []ch = {'a','b','c','d'};
			fw.write(ch);
			fw.write("hello,world");
			fw.flush();//flush() method is in fileWriter is used to clear the writer's buffer and force any buffered data to written in the file immediately.
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// More Examples
public class F4{
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("G:\\hello\\A.txt",false);
			fw.write("Line1");
			fw.write("/n");
			fw.write("Line2");
			fw.write("/n");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
