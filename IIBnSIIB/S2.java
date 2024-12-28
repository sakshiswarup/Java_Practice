package IIBnSIIB;

//public class S2 {//o/p IIB S2 SIB IIB S2 main
//	{
//		System.out.println("IIB");
//	}
//	static {
//		new S2();
//		System.out.println("SIB");
//	}
//	S2(){
//		System.out.println("S2");
//	}
//	public static void main(String[] args) {
//		S2 s = new S2();
//		System.out.println("main");
//	}
//}

//public class S2{
//	static {
//		System.out.println("SIB");
//	}
//	static {
//		System.out.println("hello");
//		new S2();
//	}
//	{
//		System.out.println("IIB");
//	}
//	public static void main(String[] args) {
//		new S2();
//		System.out.println("main");
//	}
//}

//if you create an object inside IIB you will not get any error but the program will halt abrupt you

public class S2{
	{
		System.out.println("IIB");
		new S2();//exception showing
	}
	public static void main(String[] args) {
		S2 s = new S2();
		System.out.println("from main");
	}
}