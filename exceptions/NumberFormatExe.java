package exceptions;
//This is a run time exception.
//This exception occurs when invalid string to number conversion is done.
//public class NumberFormatExe {
//public static void main(String[] args) {
//	try {
//		String x ="mike100@";
//		int val1 = Integer.parseInt(x);//NumberFormatException
//		System.out.println(val1);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	System.out.println("welcome");
//}
//}

public class NumberFormatExe{
	public static void main(String[] args) {
		try {
			int x = 10/0;//ArithmeticException:/by zero
			String y ="mike1000@";
			int val1 = Integer.parseInt(y);//NumberFormatExe.java:20)
			System.out.println(val1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}
	
}