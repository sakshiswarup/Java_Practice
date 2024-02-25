package java_1;

import java.io.File;

//length()-it is a non-static method present inside file class.
//return type of this method value is long
//it will count characters as well whitespaces.

public class Filehandling_len {
public static void main(String[] args) {
	File f = new File("G://hello//A.txt");
	long val = f.length();
	System.out.println(val);
}
}


