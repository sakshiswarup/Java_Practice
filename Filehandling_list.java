package java_1;

import java.io.File;
//list() it will fetch file name in the given path and return string array

public class Filehandling_list {
	public static void main(String[] args) {
		File f = new File("G://hello//");//pathName:"G://hello//"
		String[] names = f.list();
		for (String name :names) {
			System.out.println(name);
		}
		System.out.println(names.length);//no of files present in it
	}
}