package IIBnSIIB;

//SIB= Static Initialization Block
//SIB runs before main method and it does not require any invoking statement

//public class S {//o/p from SIB from main
//static {
//	System.out.println("from SIB");
//}
//public static void main(String[] args) {
//	System.out.println("from main");
//}
//}

//public class S{//o/p 20 from main
//	static int i;
//	static {
//		i=20;
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		System.out.println("from main");
//	}
//}

//public class S{//o/p from SIB from IIB from main
//	{
//		System.out.println("from IIB");
//	}
//	static {
//		System.out.println("from SIB");
//	}
//	public static void main(String[] args) {
//		S s = new S();
//		System.out.println("from main");
//	}
//}


//we cannot initialize non static variable inside SIB
//public class S{
//	int i;
//	static {
//		i= 20;//error
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		System.out.println("from main");
//	}
//}

//public class S{//SIB fromIIB S
//	{
//		System.out.println("fromIIB");
//	}
//	S(){
//		System.out.println("S");
//		
//	}
//	static {
//		System.out.println("SIB");
//	}
//	public static void main(String[] args) {
//		S s1 = new S();
//	}
//}

public class S{//o/p 3 1 2 4 main
	{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	static {
		System.out.println("3");
	}
	S(){
		System.out.println("4");
	}
	public static void main(String[] args) {
		S s1 = new S();
		System.out.println("main");
	}
}