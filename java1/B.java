package java1;
//Static variable are created outside method but inside class using static keyword
//public class B{
//	static int x = 20;
//	public static void main(String[] args) {
//		B b1 = new B();
//		System.out.println(B.x);
//	}
//}

//Static members are loaded into common memory only once

//public class B{
//	public static void main(String[] args) {
//		B b1 = new B();
//		b1.test();
//	}
//	public void test() {
//		System.out.println(100);
//	}
//}

public class B{
	public static void main(String[] args) {
		B b1= new B();
		b1.test();
	}
	public static void test() {
		System.out.println(500);
	}
}