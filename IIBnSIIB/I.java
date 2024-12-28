package IIBnSIIB;
//IIB= Instant Initialization Block
//IIB's are executed when objects are created
//no of times we create object same number of times IIB called.
//IIB are used to initialized all the instance variable in one place that gives us better readability of code. 
//public class I {
//	{
//		System.out.println("From IIB");
//	}
//	public static void main(String[] args) {
//		I i = new I();
//		I i1= new I();//o/p from IIB from IIB
//	}
//}


//public class I{//o/p  Start from main from IIb from constructor from main
//	{
//		System.out.println("from IIb");
//	}
//	I(){
//		System.out.println("from constructor");
//	}
//	public static void main(String[] args) {
//		System.out.println("Start from main");
//		I i = new I();
//		System.out.println("from main");
//	}
//}

//public class I{//o/p IIB1 IIB2 from constructor
//	I(){
//		System.out.println("From constructor");
//	}
//	{
//		System.out.println("IIB1");
//	}
//	{
//		System.out.println("IIB2");
//	}
//	public static void main(String[] args) {
//		I i = new I();
//	}
//}

//we can initialized static nd non variable inside IIB
public class I{
	static int i = 10;
	{
		i=20;
		System.out.println(i);//20
	}
	public static void main(String[] args) {
		I i = new I();
	}
}
