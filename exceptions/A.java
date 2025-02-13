package exceptions;
//When a bad user input is given program execution will stop abruptly. This is called exception.
//we can handle exception in java using try catch block
//when an exception occurs in try catch block, try block will create exception object and 
//this objects address it will give it to catch block. Catch block will now suppress the exception & hence further will continue to run.
public class A {
 public static void main(String[] args) {
	int x = 10;
	int y = 0;
	int z = x/y;
	// System.out.println(z);//it will give an ArithmeicException.
	System.out.println("welcome");
	 try {
			int x = 10;
			int y = 0;
			int z = x/y;
			System.out.println(z);
	} catch (Exception e) {//here e is reference variable
		System.out.println(e);//print reference address.
	}
	 System.out.println("welcome");
}
}

public class A{
	public static void main(String[] args) {
		try {
			int x = 10;
			int y =0;
			int z = x/y;
			System.out.println(z);
		} catch (Exception e) {
			e.printStackTrace();//this method gives error of line no(location error).
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("welcome");
	}
}
