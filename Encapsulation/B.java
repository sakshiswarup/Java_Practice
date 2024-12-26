package Encapsulation;

import java.io.BufferedReader;
import java.io.FileReader;

public class B {
public static void main(String[] args) {
	A a1 = new A();
	try {
		FileReader fr = new FileReader("G:\\hello\\A.txt");
		BufferedReader br = new BufferedReader(fr);
		a1.setPassword(br.readLine());
		System.out.println(a1.getPassword());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
