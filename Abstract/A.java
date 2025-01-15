package Abstract;

//Abstract in java= An abstract class can consist of both complete and incomplete method in it.
abstract public class A {
abstract public void test1();
 public void test2() {
	System.out.println(2);
}
}

//Abstract  class can consists of both static and non static methods/variable.

abstract public class A{
	int x =0;
	static int y = 20;
}

//An object of abstract class cannot be created.
abstract public class A{
	int x = 10;
	static int y = 20;
}

//Abstract class does not class multiple inheritance.
//abstract public class A{
//	
//}

//with Static keyword
//abstract public class A{
//	static int x = 10;
//	public static void main(String[] args) {
//		System.out.println(A.x);
//	}
//	public static void test() {
//		System.out.println(200);
//	}
//}

//with interface
//interface- abstract - class
//public interface A{
//	public void test1();
//}

//with the help of supper keyword constructor create
abstract public class A{
	A(){
		System.out.println("a");
	}
}
