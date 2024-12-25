package p1;
//Multiple Catch block
public class multipleCatch {
public static void main(String[] args) {
	try {
		Integer.parseInt("Hello");
		int x =10;
		int y =0;
		int z =x/y;
	}catch(NullPointerException e) {
		System.out.println(1);
	}catch(ArithmeticException e) {
		System.out.println(2);
	}
	catch (Exception e) {
		System.out.println(3);
	}
}
}
