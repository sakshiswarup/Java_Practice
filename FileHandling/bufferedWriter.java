package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

//BufferedWriter()
//it improves file writing performance.
//it has newLine concept.
public class bufferedWriter {
public static void main(String[] args) {
	try {
		FileWriter fw = new FileWriter("G:\\hello\\A.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		char []ch= {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("mike");
		bw.close();
		fw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
