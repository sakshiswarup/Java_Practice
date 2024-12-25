package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

//BufferedReader()
//it improves file reading performance 
//It has readLine() method which can read file content line by line.
public class bufferRead {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("G:\\hello\\A.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
