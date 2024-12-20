package ScannerClass;
//Scanner class is used to get input from the user .you can use it to read data of various types,such as int,string and more.
//you need to import java.util.Scanner.
import java.util.Scanner;

public class Scanner1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter your name");
	String name = scan.next();//next method cannot take more than one word
	System.out.println("Your name is " +name);
	scan.close();
	
}
}

public class Scanner1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//here System.in is for reading inputs.
		System.out.println("Enter your full name ");
		String name = scan.nextLine();//this nextLine() methods read multiple words and print.
		System.out.println("Your name is "+ name);
		scan.close();
	}
}

public class Scanner1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Employee ID");
		int empId = scan.nextInt();//here integer type storing data
		System.out.println("your employee id is " +empId);
		scan.close();
	}
}

public class Scanner1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Employee Id");
		byte empId = scan.nextByte();//byte range is (-127 to 128).//128input throwing java.util.InputMismatchException
		System.out.println("your employee id is "+empId);
	}
}
