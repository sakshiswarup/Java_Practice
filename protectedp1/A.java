package protectedp1;
//Access Specifiers Protected

//If you make variable or method to Protected then you can access that inside same class and same package & in the different package 
//through inheritance only.
//same class-yes
//public class A {
//protected int x =10;
//protected void test() {
//	System.out.println("from test");
//}
//public static void main(String[] args) {
//	A a1 = new A();
//	a1.test();
//	System.out.println(a1.x);
//}
//}

//same package sub class
//public class A {
//protected int x =10;
//protected void test() {
//	System.out.println("from test");
//}
//}

//--
//Different package sub class= yes
//public class A {
//	protected int x = 10;
//	protected void test() {
//		System.out.println("from test1");
//	}
//}

//Different package non sub class=No

public class A{
	protected int x = 10;
	protected void test() {
		System.out.println("from test2");
	}
}