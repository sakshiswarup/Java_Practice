package publicp1;
//Access Specifiers - public 
//Same class-Yes

//If you make a variable/method public then you can access that inside same class and same package & in different package also.

//public class A {
//public int x= 10;
//public void test() {
//	System.out.println("from test.");
//}
//public static void main(String[] args) {
//	A a1 = new A();
//	a1.test();
//	System.out.println(a1.x);
//}
//}
//---
////same package but sub class
//public class A {
//public int x= 10;
//public void test() {
//	System.out.println("from test.");
//}
//
//}
//--
//same package but non sub class=yes
//public class A {
//public int x= 10;
//public void test() {
//	System.out.println("from test.");
//}
//}

//--
//different package but sub class=yes
public class A {
public int x= 10;
public void test() {
	System.out.println("from test.");
}
}