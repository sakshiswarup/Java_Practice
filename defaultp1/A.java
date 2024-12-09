package defaultp1;
//default Access Specifiers
//same class - yes
//public class A {
//	 int x= 10;
//	void test() {
//		System.out.println(100);
//	}
//	public static void main(String[] args) {
//		A a1 = new A();
//		System.out.println(a1.x);
//		a1.test();
//	}
//
//}
//--
//default same package sub class= yes
//public class A {
//	 int x =10;
//	 void test() {
//		 System.out.println("from test");
//	 }
//
//}
//--
//same package non sub class -yes
//public class A {
//int x =10;
//void test() {
//	 System.out.println("from test");
//}
//}

//Different package sub class -NO
//public class A {
//int x =10;
//void test() {
//	 System.out.println("from test");
//}
//
//}
//Different package non sub class -NO
public class A {
int x =10;
void test() {
	 System.out.println("from test");
}

}