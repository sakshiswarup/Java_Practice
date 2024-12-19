package exceptions;
//Exception class acts like a global exception handler class that is it can access any kind of exception that occurs in the program.
//This is run time exception.
//this exception occurs when null reference variable is used to access non static members.

//public class NullPointer {
//int x = 10;
//public static void main(String[] args) {
//	try {
//		int y = 10/0;//nullpointer exception
//		NullPointer n1= null;
//		System.out.println(n1.x);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
//}
//---
public class NullPointer{
  static NullPointer n1 = null;	
  int x = 10;
  public static void main(String[] args) {
	try {
		System.out.println(n1.x);//acts like (NullPointer.x) //NullPointer.java:24
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("welcome");
}
}