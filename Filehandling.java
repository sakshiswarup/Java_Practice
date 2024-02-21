package java_1;
// exists() - checks whether the file is present in given path. if yes this will return true or else false
import java.io.File;

public class Filehandling {

public static void main(String[] args) {
	File f = new File("G://hello//A.txt");
	 boolean val = f.exists();
	 System.out.println(val);
}
}
