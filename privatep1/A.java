package privatep1;

//Access Specifiers in java
//private- same class- yes
//we cannot apply access specifiers in local variables , 
//Access specifiers is applicable for static and non static members
//public class A {
//private int x = 20;
//private void test() {
//	  System.out.println("from test");
//}
//public static void main(String[] args) {
//	  A a1 = new A();
//	  System.out.println(a1.x);
//	  a1.test();
//}
//}
//private - same package sub class- no

//public class A{
//	private int x = 10;
//	private void test() {
//		System.out.println("from test");
//	}
//}
//private - same package non sub class

//public class A{
//	private int x = 10;
//	private void test() {
//		System.out.println("from test1"); // go for B.java
//	}
//}

//private- different package sub class- no
//public class A{
//	private int x = 10;
//	private void test() {
//		System.out.println("from, test");
//	}
//}

//private - different package non sub class - no

public class A{
	private int x= 20;
	private void test() {
		System.out.println("from testt");
	}
}