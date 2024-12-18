package exceptions;
//it is Runtime/Unchecked exception.
//it occurs when invalid mathematical operations are performed , it can be handled by using Arithmetic Exception class.
//public class ArithmeticException {
//public static void main(String[] args) {
//	try {
//		int x = 10;
//		int y = 0;
//		if(x%y==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
//		
//	} catch (Exception e) {
//		e.printStackTrace();//it gives arithmetic exception.
//	}
//	System.out.println(100);
//}
//}

//public class ArithmeticException{
//	public static void main(String[] args) {
//		try {
//			int numerator = 10;
//			int denominator = 0;
//			//Attempting divide by zero
//			int result = numerator/denominator;//This will throw arithmetic exception.
//			System.out.println("result"+ result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(100);
//	}
//}
//
//public class ArithmeticException{
//	public static void main(String[] args) {
//		try {
//			int numerator = 10;
//			int denominator = 3;
//			int result = numerator % denominator;
//			System.out.println("result"+result);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(500);
//	}
//}


public class ArithmeticException{
	public static void main(String[] args) {
		try {
			int numerator = 10;
			int denominator = 0;
			int result = numerator % denominator;//throwing arithmetic exception.
			System.out.println("result"+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(500);
	}
}